package io.nology.to_do_api.task;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAll() {
        return this.repo.findAll();
    }

    public List<Task> getUnarchived() {
        return this.repo.findAll().stream().filter((task) -> !task.isArchived()).collect(Collectors.toList());
    }

    public Optional<Task> getById(Long id) {
        return this.repo.findById(id);
    }

    public Task createTask(CreateTaskDTO data) {

        Task newTask = new Task();
        newTask.setTask(data.getTask());
        if (data.getCategory() != null) {
            newTask.setCategory(data.getCategory());
        }
        return this.repo.save(newTask);

    }

    public void updateTask(Long id, UpdateTaskDTO data) {
        Task task = this.repo.findById(id).get();
        if (task.getTask() != null) {
            task.setTask(data.getTask());
        }
        if (task.getCategory() != null) {
            task.setCategory(data.getCategory());
        }

        repo.save(task);
    }

    //// DONT DELETE / ARCHIVE IT
    public void archiveTask(Long id) throws Exception {
        Task task = this.repo.findById(id).get();
        task.setArchived(true);
        repo.save(task);
    }

}
