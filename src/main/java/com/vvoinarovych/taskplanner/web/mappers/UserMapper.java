package com.vvoinarovych.taskplanner.web.mappers;

import com.vvoinarovych.taskplanner.domain.user.User;
import com.vvoinarovych.taskplanner.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
