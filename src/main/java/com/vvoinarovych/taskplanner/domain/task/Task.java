package com.vvoinarovych.taskplanner.domain.task;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationTimeDate;
}
