import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { WelcomeDataService } from '../service/welcome-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css'] 
})
export class WelcomeComponent implements OnInit {

  message:string='';
  name='';
  constructor(private route: ActivatedRoute,private welcomeDataService:WelcomeDataService) { }

  ngOnInit() {
    this.name=this.route.snapshot.params['name'];
   
  }
  
  getHelloWorldMessage() {
    this.welcomeDataService.execuateHelloWorldService()
    .subscribe(data =>this.handleResponse(data),
    error=>this.handlerErrorResponse(error));
  }


  getHelloWorldMessageWithPath() {
    this.welcomeDataService.execuateHelloWorldWithPath(this.name)
    .subscribe(data =>this.handleResponse(data),
    error=>this.handlerErrorResponse(error));
  }




  handleResponse(response) {
    console.log(response);
    console.log(response.message);
    this.message=response.message;
  }

  handlerErrorResponse(error) {
    console.log(error.error.message);
    this.message=error.error.message;
  }
}


// Access to XMLHttpRequest at 'http://localhost:8085/helloWorld/jmartinez' from origin 'http://localhost:4200' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.

// Access to XMLHttpRequest at 'http://localhost:8085/helloWorld/jmartinez' from origin 'http://localhost:4200' has been blocked by CORS policy: Response to preflight request doesn't pass access control check: It does not have HTTP ok status.