package io.nology.to_do_api.task;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateTaskDTO {

    private Long id;

    @NotBlank(message = "Please enter some text")
    private String task;

    // private Integer categoryId;

    public String getTask() {
        return task;
    }

    public Long getId() {
        return id;
    }

    public Long setId(Long id) {
        return this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // public Integer getCategoryId() {
    // return categoryId;
    // }

    // public void setCategoryId(Integer categoryId) {
    // this.categoryId = categoryId;
    // }
}
