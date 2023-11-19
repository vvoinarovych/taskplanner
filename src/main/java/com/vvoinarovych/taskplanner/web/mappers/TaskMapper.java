package com.vvoinarovych.taskplanner.web.mappers;

import com.vvoinarovych.taskplanner.domain.task.Task;
import com.vvoinarovych.taskplanner.web.dto.taskDto.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto taskDto);
}
