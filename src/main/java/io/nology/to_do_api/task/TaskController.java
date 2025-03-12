package io.nology.to_do_api.task;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = this.taskService.getUnarchived();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody @Valid CreateTaskDTO data) {
        Task newTask = this.taskService.createTask(data);
        return new ResponseEntity<Task>(newTask, HttpStatus.CREATED);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Task.Category>> getCategories() {
        return new ResponseEntity<>(Arrays.asList(Task.Category.values()), HttpStatus.OK);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Void> updateTask(@PathVariable Long id, @RequestBody @Valid UpdateTaskDTO data) {
        taskService.updateTask(id, data);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //// DONT DELETE / ARCHIVE IT
    @PatchMapping("/archive/{id}")
    public ResponseEntity<Void> archiveTask(@PathVariable Long id)
            throws Exception {
        taskService.archiveTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
