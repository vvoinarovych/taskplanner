package com.vvoinarovych.taskplanner.service;

import com.vvoinarovych.taskplanner.domain.task.Task;

import java.util.List;

public interface TaskService {
    Task findById(Long id);

    List<Task> getAllByUserId(Long userId);

    Task update(Task task);

    Task create(Task task, Long id);

    void delete(Long id);

}
