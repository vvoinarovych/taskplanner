package com.vvoinarovych.taskplanner.web.controller;

import com.vvoinarovych.taskplanner.domain.task.Task;
import com.vvoinarovych.taskplanner.service.TaskService;
import com.vvoinarovych.taskplanner.web.dto.taskDto.TaskDto;
import com.vvoinarovych.taskplanner.web.mappers.TaskMapper;
import com.vvoinarovych.taskplanner.web.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;


    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class)@RequestBody TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task updatedTask = taskService.update(task);
        return taskMapper.toDto(updatedTask);
    }
    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        Task task = taskService.findById(id);
        return taskMapper.toDto(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }
}

