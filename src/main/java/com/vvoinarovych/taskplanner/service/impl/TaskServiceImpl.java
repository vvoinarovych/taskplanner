package com.vvoinarovych.taskplanner.service.impl;

import com.vvoinarovych.taskplanner.domain.task.Task;
import com.vvoinarovych.taskplanner.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(Long userId) {
        return null;
    }

    @Override
    public Task update(Task task) {

        return task;
    }

    @Override
    public Task create(Task task, Long id) {
        return task;
    }

    @Override
    public void delete(Long id) {

    }
}
