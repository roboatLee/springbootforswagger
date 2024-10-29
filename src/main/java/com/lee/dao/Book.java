package com.lee.dao;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Book {
    @Schema(hidden = true)
    private long id;

    @NotBlank
    @Size(min = 0,max = 20)
    private String title;

    @NotBlank
    @Size(min = 0,max = 20)
    private String author;
}
