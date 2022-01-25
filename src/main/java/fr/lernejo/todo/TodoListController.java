package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {

    private ArrayList<Todo> smallList;

    public TodoListController(ArrayList<Todo> smallList) {
        this.smallList = smallList;
    }

    @PostMapping("/api/todo")
    public void AddTodo(Todo bob) {
        smallList.add(bob);
    }

    @GetMapping("/api/todo")
    public ArrayList<Todo> ReturnList() {
        return this.smallList;
    }
}
