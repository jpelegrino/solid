import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpHandler, HttpRequest } from '@angular/common/http';
import { BasicServiceService } from './basic-service.service';

@Injectable({
  providedIn: 'root'
})
export class HttpIntercepterBasicAuthService implements HttpInterceptor{

  constructor(
    private basicServiceService: BasicServiceService
  ) { }

  intercept(req: HttpRequest<any>, next: HttpHandler) {
    let basicAuthHeader=this.basicServiceService.getAuthenticatedToken();
    let authenticatedUser=this.basicServiceService.getAuthenticatedUser();

    if(basicAuthHeader && authenticatedUser) {
        req=req.clone({
          setHeaders: {
            Authorization: basicAuthHeader
          }
        });
    }

    

    return next.handle(req);
    
  }

  // createBasicAuthenticationHttpHeader() {
  //   let username='admin';
  //   let password='admin';
  //   let authStr='Basic '+ window.btoa(username+':'+password);  // Allow to encode 

  //   return authStr;
  // }
}
