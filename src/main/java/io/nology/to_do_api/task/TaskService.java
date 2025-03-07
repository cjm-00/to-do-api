package io.nology.to_do_api.task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nology.to_do_api.category.Category;
import io.nology.to_do_api.category.CategoryService;

@Service
public class TaskService {
    // private CategoryService categoryService;
    @Autowired
    private TaskRepository repo;

    public TaskService(TaskRepository repo
    // , CategoryService categoryService
    ) {
        this.repo = repo;
        // this.categoryService = categoryService;
    }

    public List<Task> getAll() {
        return this.repo.findAll();
    }

    public Optional<Task> getById(Long id) {
        return this.repo.findById(id);
    }

    public Task createTask(CreateTaskDTO data) {

        Task newTask = new Task();
        newTask.setId(data.getId());
        newTask.setTask(data.getTask().trim());
        // if (data.getCategoryId() != null) {
        // Category foundCategory =
        // this.categoryService.getById(data.getCategoryId()).orElse(null);
        // newTask.setCategory(foundCategory);
        // }
        return this.repo.save(newTask);

    }

    //// DONT DELETE / ARCHIVE IT
    // public void deleteTask(Long id) {
    // Optional<Task> searchResult = this.getById(id);
    // if (searchResult != null) {
    // this.repo.delete(searchResult.get());
    // }
    // }

}
