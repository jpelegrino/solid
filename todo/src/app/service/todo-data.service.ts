import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Todo } from '../model/todo';


const baseUrl='http://localhost:8085/todos/';

@Injectable({
  providedIn: 'root'
})
export class TodoDataService {

  constructor(private http: HttpClient) { }

  findTodoById(id:number) {
    return this.http.get<Todo>(baseUrl+id);
  }


  updateTodo(todo:Todo) {
    return this.http.put(baseUrl,todo);
  }

  saveTodo(todo:Todo) {
    return this.http.post(baseUrl,todo);
  }

}
