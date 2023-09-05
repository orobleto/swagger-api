package com.octaviorobleto.swagger.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.octaviorobleto.swagger.api.utilities.examples.JsonExamples;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Schema(name = "user-dto", example = JsonExamples.USER_DTO)
@Component
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDTO {
    @Schema(description = "correo electronico del usuario")
    @JsonProperty(value = "email", required = true)
    private String email;
    @Schema(description = "clave del usuario")
    @JsonProperty(value = "password", required = true)
    private String password;
}