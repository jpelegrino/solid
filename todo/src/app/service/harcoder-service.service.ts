import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HarcoderServiceService {
   newLocal = 'authenticatedUser';
  constructor() { }

  authenticate(user,pass) {
    if(user==='jmartinez' && pass==='dummy') {
      
      sessionStorage.setItem(this.newLocal,user);
      return true;
    }
    return false;
  }


  isLogin() {
    let userIn=sessionStorage.getItem(this.newLocal);
    return !(userIn===null);
  }

  logout() {
    sessionStorage.removeItem(this.newLocal);
  }
}
