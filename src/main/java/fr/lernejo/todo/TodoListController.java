package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    public TodoRepository todoRepository;

    public TodoListController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("/api/todo")
    public void AddTodo(@RequestBody TodoEntity bob) {
        this.todoRepository.save(bob);
    }

    @GetMapping("/api/todo")
    public Iterable<TodoEntity> ReturnList() {
        return this.todoRepository.findAll();
    }
}
