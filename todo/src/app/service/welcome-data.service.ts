import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WelcomeDataService {

  constructor(private http:HttpClient) { }

  execuateHelloWorldService() {
    let basicAuthenticationHeader=this.createBasicAuthenticationHttpHeader();

    let headers=new HttpHeaders({
      Authorization: basicAuthenticationHeader
    });

    return this.http.get<HelloWorldBean>('http://localhost:8085/helloWorld',{headers});
  }

  execuateHelloWorldWithPath(name:string) {
    let basicAuthenticationHeader=this.createBasicAuthenticationHttpHeader();

    let headers=new HttpHeaders({
      Authorization: basicAuthenticationHeader
    });
    return this.http.get<HelloWorldBean>(`http://localhost:8085/helloWorld/${name}`,{headers});
  }

  getAllTodos(): Observable<any> {
    return this.http.get<HelloWorldBean>(`http://localhost:8085/todos`);
  }

  deleteTodoById(id:number) {
    return this.http.delete(`http://localhost:8085/todos/${id}`);
  }

  createBasicAuthenticationHttpHeader() {
    let username='admin';
    let password='admin';
    let authStr='Basic '+ window.btoa(username+':'+password);  // Allow to encode 

    return authStr;
  }

}

export class HelloWorldBean {
  constructor(public message:string) {}
}
