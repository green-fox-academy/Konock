'use strict';
var Todo = /** @class */ (function () {
    function Todo(description) {
        this.todoid = Todo.id++;
        this.description = description;
    }
    Todo.prototype.editTodo = function (newDescription) {
        this.description = newDescription;
    };
    Todo.id = 0;
    return Todo;
}());
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.todolist = [];
    }
    TodoList.prototype.addTodo = function (description) {
        this.todolist.push(new Todo(description));
    };
    TodoList.prototype.deleteTodo = function (todoid) {
        this.todolist.splice(todoid);
    };
    TodoList.prototype.editTodo = function (todoid, description) {
        this.todolist[todoid].editTodo(description);
    };
    TodoList.prototype.printTodolist = function () {
        this.todolist.forEach(function (todo) {
            console.log(todo.description);
        });
    };
    TodoList.prototype.showTodolist = function () {
        this.todolist.forEach(function (todo) {
            var newRow = document.createElement("tr");
            var newData = document.createElement("td");
            var newNode = document.createTextNode(todo.description);
            newData.appendChild(newNode);
            newRow.append(newData);
            var tbody = document.getElementById("todolist");
            tbody.append(newRow);
        });
    };
    return TodoList;
}());
var todolist = new TodoList();
todolist.addTodo("buy milk");
todolist.addTodo("walk fox");
todolist.addTodo("learn JavaScript");
todolist.printTodolist();
todolist.showTodolist();
