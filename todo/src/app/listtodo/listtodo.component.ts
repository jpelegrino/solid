import { Component, OnInit } from '@angular/core';
import { Todo } from '../entities/todo';
import { WelcomeDataService } from '../service/welcome-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listtodo',
  templateUrl: './listtodo.component.html',
  styleUrls: ['./listtodo.component.css']
})
export class ListtodoComponent implements OnInit {

  todos:any[];
  message='';
  alertOpened=false;

  // todos=[
  //   new Todo(1,'Learn Angular',new Date(),false),
  //   new Todo(2,'Learn React',new Date(),false),
  //   new Todo(3,'Learn PHP',new Date(),false),
  //   // {id:1,description:'Learn Angular'},
  //   // {id:2,description:'Learn React'},
  //   // {id:3,description:'Learn PHP'}
  // ]

  constructor(private router: Router,
    private welcomeDataServe:WelcomeDataService) { }

  ngOnInit() {    
   this.goToList();
  }

  deleteTodo(id :number) {
    this.welcomeDataServe.deleteTodoById(id)
    .subscribe(data=>{
      this.message='This todo is successfuly deleted';
      this.alertOpened=true;
      this.goToList();
    },
    error=>console.log(error));

    
  }

  goToList() {    
    this.welcomeDataServe.getAllTodos()
    .subscribe(data => {    
     
      this.todos=data;      
    },error=>console.log(error));
  }

  closeAlert() {
    console.log(this.alertOpened);
    return this.alertOpened=!this.alertOpened;
  }

  updateTodo(id) {
    console.log(id);
    this.router.navigate(['todo',id]);
  }

  addTodo() {
    this.router.navigate(['todo',-1]);
  }

}
