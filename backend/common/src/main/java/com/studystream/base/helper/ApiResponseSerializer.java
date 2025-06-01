package com.studystream.base.helper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.studystream.base.response.ApiResponse;

import java.io.IOException;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ApiResponseSerializer extends StdSerializer<ApiResponse<?>> {

    public ApiResponseSerializer() {
        this(null);
    }

    public ApiResponseSerializer(Class<ApiResponse<?>> t) {
        super(t);
    }

    @Override
    public void serialize(ApiResponse<?> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(ZoneId.of("Asia/Ho_Chi_Minh"));
        gen.writeStringField("timestamp", formatter.format(value.getTimestamp()));
        gen.writeNumberField("status", value.getStatus());
        gen.writeBooleanField("success", value.isSuccess());
        gen.writeStringField("message", value.getMessage());

        // Nếu có lỗi, ghi lại thông tin lỗi
        if (value.getDetails() != null) {
            if (value.getDetails() instanceof Map<?, ?>) {
                gen.writeObjectField("details", value.getDetails());
            } else {
                gen.writeStringField("details", value.getDetails().toString());
            }
        }

        // Nếu có dữ liệu, ghi lại dữ liệu
        if (value.getData() != null) {
            gen.writeObjectField("data", value.getData());
        }

        // Nếu có đường dẫn, ghi lại đường dẫn
        if (value.getPath() != null) {
            gen.writeStringField("path", value.getPath());
        }

        // Nếu có traceId, ghi lại traceId
        // String traceId = MDC.get("traceId");
        // if (traceId != null) {
        // gen.writeStringField("traceId", traceId);
        // }

        gen.writeEndObject();
    }

}
