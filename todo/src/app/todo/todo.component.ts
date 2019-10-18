import { Component, OnInit } from '@angular/core';
import { TodoDataService } from '../service/todo-data.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from '../model/todo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  id:number;
  todo:Todo;
  
  constructor(private todoDataService: TodoDataService,
    private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {
    this.todo={id:this.id,username:'',description:'',isDone:false,targetDate:null};
    this.id=this.route.snapshot.params['id'];


    if(this.id!=-1) {
        this.todoDataService.findTodoById(this.id)
        .subscribe(data =>{      
          this.todo=data;
          console.log(this.todo);
        },error=>console.log(error));
    }

  
  }


  saveTodo() {
    if(this.id!=-1) {
        this.todoDataService.updateTodo(this.todo)
      .subscribe(data =>{
        console.log(data);
        this.router.navigate(['todo']);
      });
    }else {
      this.todoDataService.saveTodo(this.todo)
      .subscribe(data =>{
        console.log(data);
        this.router.navigate(['todo']);
      });
    }
    
  }

}
