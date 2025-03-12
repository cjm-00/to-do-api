package io.nology.to_do_api.task;

import io.micrometer.common.lang.Nullable;
import io.nology.to_do_api.task.Task.Category;;

public class UpdateTaskDTO {

    @Nullable
    private String task;

    @Nullable
    private Category category;

    @Nullable
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
