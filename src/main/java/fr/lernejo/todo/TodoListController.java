package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private final List<Todo> smallList = new ArrayList<>();

    @PostMapping("/api/todo")
    public void AddTodo(Todo bob) {
        smallList.add(bob);
    }

    @GetMapping("/api/todo")
    public List<Todo> ReturnList() {
        return this.smallList;
    }
}
