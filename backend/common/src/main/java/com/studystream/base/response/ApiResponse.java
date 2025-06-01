package com.studystream.base.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.studystream.base.helper.ApiResponseSerializer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(using = ApiResponseSerializer.class)
public class ApiResponse<T> {

    @Builder.Default
    private ZonedDateTime timestamp = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
    private Integer status;
    private boolean success;
    private String message;
    private T data;
    private Object details;
    // private String traceId;
    private String path;
}
