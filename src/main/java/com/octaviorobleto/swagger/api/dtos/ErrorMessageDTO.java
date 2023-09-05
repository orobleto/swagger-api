package com.octaviorobleto.swagger.api.dtos;

import com.octaviorobleto.swagger.api.utilities.examples.JsonExamples;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Schema(name = "error-message-dto", example = JsonExamples.ERROR_MESSAGE_DTO)
@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessageDTO {

    @Schema(description = "codigo de error")
    private int code;

    @Schema(description = "mensaje de error")
    private String message;
}