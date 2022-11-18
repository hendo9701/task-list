package com.demos.tasklist.tasks;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class UpdateTaskRequest {
  @NotBlank(message = "[content] property is required")
  private final String content;
}