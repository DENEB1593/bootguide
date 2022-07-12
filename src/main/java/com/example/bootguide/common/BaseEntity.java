package com.example.bootguide.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class BaseEntity {

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
