package io.nology.to_do_api.task;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// id: number
// task: string
// category: many2one

@Entity
@Table(name = "tasks")
public class Task {
    enum Category {
        CLEANING,
        PROJECTS,
        ERRANDS,
        STUDY,
        EXERCISE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String task;

    @Nullable
    private Category category;

    private boolean isArchived;

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Task(String task) {
        this.task = task;

    }

    public Task() {
        // no args constructor
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
