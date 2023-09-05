package com.octaviorobleto.swagger.api.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/v1/main/" }, produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {
    @Operation(tags = "Main", description = "Main", summary = "EndPoint para validar que servicio esta vivo")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = String.class), examples = @ExampleObject(name = "Ejemplo", value = "pong...")) }) })
    @GetMapping(path = { "/ping" })
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong...");
    }
}
