import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HarcoderServiceService } from '../service/harcoder-service.service';
import { BasicServiceService } from '../service/http/basic-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username='admin';
  password='admin';
  errorMessage='Invalid authentication';
  invalidAuth=false;
  constructor(private router:Router,
    private harcoderService: HarcoderServiceService,
    private basicServiceService: BasicServiceService
    ) { }

  ngOnInit() {
  }


  handleAuthlogin() {

    this.basicServiceService.executeAuthLogin(this.username,this.password)
    .subscribe(data =>{
      this.router.navigate(['welcome',this.username]);
      this.invalidAuth=false;
    },
    error => {
      console.log(error);
      this.invalidAuth=true;
    });

  }

}
