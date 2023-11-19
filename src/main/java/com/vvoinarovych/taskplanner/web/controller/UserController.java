package com.vvoinarovych.taskplanner.web.controller;

import com.vvoinarovych.taskplanner.domain.task.Task;
import com.vvoinarovych.taskplanner.domain.user.User;
import com.vvoinarovych.taskplanner.service.TaskService;
import com.vvoinarovych.taskplanner.service.UserService;
import com.vvoinarovych.taskplanner.web.dto.taskDto.TaskDto;
import com.vvoinarovych.taskplanner.web.dto.user.UserDto;
import com.vvoinarovych.taskplanner.web.mappers.TaskMapper;
import com.vvoinarovych.taskplanner.web.mappers.UserMapper;
import com.vvoinarovych.taskplanner.web.validation.OnCreate;
import com.vvoinarovych.taskplanner.web.validation.OnUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User updatedUser = userService.update(user);
        return userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id){
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTasksById(@PathVariable Long id){
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto createTask(@PathVariable Long id,
                              @Validated(OnCreate.class) @RequestBody TaskDto dto){
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task, id);
        return taskMapper.toDto(createdTask);
    }
}
