'use strict';

class Todo {
  static id: number = 0;
  todoid: number;
  description: string;

  constructor (description: string) {
    this.todoid = Todo.id++;
    this.description = description;
  }

  editTodo(newDescription: string) {
    this.description = newDescription;
  }
}

class TodoList {
  todolist: Todo[];

  constructor() {
    this.todolist = [];
  }

  addTodo(description: string) {
    this.todolist.push(new Todo(description));
  }

  deleteTodo(todoid: number) {
    this.todolist.splice(todoid);
  }

  editTodo(todoid: number, description: string) {
    this.todolist[todoid].editTodo(description);
  }

  printTodolist() {
    this.todolist.forEach(function(todo) {
      console.log(todo.description);
    })
  }

  showTodolist() {
    this.todolist.forEach(function(todo) {
      let newRow = document.createElement("tr");
      let newData = document.createElement("td");
      let newNode = document.createTextNode(todo.description);
      newData.appendChild(newNode);
      newRow.append(newData);
      let tbody = document.getElementById("todolist");
      tbody.append(newRow);
    })
  }
}

let todolist = new TodoList();
todolist.addTodo("buy milk");
todolist.addTodo("walk fox");
todolist.addTodo("learn JavaScript");
todolist.printTodolist();
todolist.showTodolist();