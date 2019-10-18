import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {map} from 'rxjs/operators';
import { API_URL } from 'src/app/app.constants';



export const TOKEN= 'token';
export const AUTHENTICATED_USER='authenticatedUser';

@Injectable({
  providedIn: 'root'
})
export class BasicServiceService {
   
  constructor(private http: HttpClient) { }

  executeAuthLogin(username,password) {
    let authStr='Basic '+ window.btoa(username+':'+password); 

    let headers=new HttpHeaders({
      Authorization: authStr
    });
    return this.http.get(`${API_URL}/login`,
    {headers}).pipe(
      map(
        data => {
          sessionStorage.setItem(AUTHENTICATED_USER,username);
          sessionStorage.setItem(TOKEN,authStr);
          return data;
        }
      )
    );
  }


  getAuthenticatedUser() {
    return sessionStorage.getItem(AUTHENTICATED_USER);
  }

  getAuthenticatedToken() {
    if(this.getAuthenticatedUser()) {
      return sessionStorage.getItem(TOKEN);
    }
  }

  isLogin() {
    let userIn=sessionStorage.getItem(AUTHENTICATED_USER);
    return !(userIn===null);
  }

  logout() {
    sessionStorage.removeItem(AUTHENTICATED_USER);
    sessionStorage.removeItem(TOKEN);
  }
}
