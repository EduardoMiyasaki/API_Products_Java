package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(@NotBlank String name ,@NotNull int price_in_cents) {

    // Esse record não tem método setter pois são dados imutaveis

}
