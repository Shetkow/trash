package com.example.swaggerTestApi.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "сущность паттерна")
public class Patterns {
    @Schema(description = "Индификатор")
    private Integer id;
    @Schema(description = "для какого интсурмента паттерн")
    private String instrument;
    @Schema(description = "название патерна")
    private String tittle;
    @Schema(description = "размер паттерна")
    private String times;
    @Schema(description = "размер нот")
    private String level;

    public Patterns() {
    }

}
