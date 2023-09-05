package com.octaviorobleto.swagger.api.controllers;

import com.octaviorobleto.swagger.api.dtos.ErrorMessageDTO;
import com.octaviorobleto.swagger.api.dtos.JwtDTO;
import com.octaviorobleto.swagger.api.dtos.UserLoginDTO;
import com.octaviorobleto.swagger.api.utilities.examples.JsonExamples;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/v1/auth" }, produces = { MediaType.APPLICATION_JSON_VALUE })
public class AuthController {

    @Operation(tags = "Auth", summary = "Inicia Sesion del usuario", description = "EndPoint de inicio de sesion de los usuarios registrados en nuestra aplicacion")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK", content = {
            @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = JwtDTO.class), examples = @ExampleObject(summary = "Ejemplo OK", value = JsonExamples.JWT_DTO)) }),

            @ApiResponse(responseCode = "400", description = "Solicitud no Valida", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorMessageDTO.class), examples = @ExampleObject(summary = "Ejemplo 400", value = JsonExamples.ERROR_MESSAGE_DTO)) }),
            @ApiResponse(responseCode = "401", description = "Sin Autorizacion", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorMessageDTO.class), examples = @ExampleObject(summary = "Ejemplo 401", value = JsonExamples.AUTH_RESPONSE_401)) }),
            @ApiResponse(responseCode = "409", description = "Conflicto", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorMessageDTO.class), examples = @ExampleObject(summary = "Ejemplo 409", value = JsonExamples.AUTH_RESPONSE_409)) })

    })

    @PostMapping(path = { "/login" })
    public ResponseEntity<?> login(
            @Parameter(required = true, content = @Content(schema = @Schema(implementation = UserLoginDTO.class), mediaType = MediaType.APPLICATION_JSON_VALUE, examples = {
                    @ExampleObject(name = "Ejemplo", value = JsonExamples.USER_DTO) })) UserLoginDTO userLoginDTO) {

        try {
            // validamos existencia del usuario con sus credenciales y retornamos el token
            return ResponseEntity.ok(JwtDTO.builder().accessToken(
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                    .expiresIn(5000L).tokenType("bearer").build());
        } catch (Exception e) {
            return ResponseEntity.ok(ErrorMessageDTO.builder().code(401).message("Acceso No Autorizado").build());
        }

    }

}
