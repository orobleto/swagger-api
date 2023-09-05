package com.octaviorobleto.swagger.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.octaviorobleto.swagger.api.utilities.examples.JsonExamples;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "jwt-dto", example = JsonExamples.JWT_DTO)
public class JwtDTO {
    @Schema(description = "token de acceso")
    @JsonProperty(value = "access_token", required = true)
    private String accessToken;
    @Schema(description = "tiempo de expiracion del token")
    @JsonProperty(value = "expires_in", required = true)
    private Long expiresIn;
    @Schema(description = "tipo de token [bearer]")
    @JsonProperty(value = "token_type", required = true)
    private String tokenType;
}