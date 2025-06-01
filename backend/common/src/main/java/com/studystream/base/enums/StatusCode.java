package com.studystream.base.enums;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum StatusCode {
    // Default status code

    // 2XX Status Codes - Success
    SUCCESS(200, "Success", HttpStatus.OK),
    CREATED(201, "Created", HttpStatus.CREATED),
    ACCEPTED(202, "Accepted", HttpStatus.ACCEPTED),
    NO_CONTENT(204, "No Content", HttpStatus.NO_CONTENT),

    // 4XX Status Codes - Client Errors
    BAD_REQUEST(400, "Bad Request", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED(401, "Unauthorized", HttpStatus.UNAUTHORIZED),
    FORBIDDEN(403, "Forbidden", HttpStatus.FORBIDDEN),
    NOT_FOUND(404, "Not Found", HttpStatus.NOT_FOUND),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", HttpStatus.METHOD_NOT_ALLOWED),
    CONFLICT(409, "Conflict", HttpStatus.CONFLICT),
    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity", HttpStatus.UNPROCESSABLE_ENTITY),

    // 5XX Status Codes - Server Errors
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR),
    SERVICE_UNAVAILABLE(503, "Service Unavailable", HttpStatus.SERVICE_UNAVAILABLE),
    ;

    private final int code;
    private final String message;
    private final HttpStatus httpStatus;

    StatusCode(int code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}