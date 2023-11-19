package com.vvoinarovych.taskplanner.web.dto.taskDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vvoinarovych.taskplanner.domain.task.Status;
import com.vvoinarovych.taskplanner.web.validation.OnCreate;
import com.vvoinarovych.taskplanner.web.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Title must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Title length must be shorter than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String title;

    @Length(max = 255, message = "Description length must be shorter than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String description;

    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime expirationTimeDate;
}
