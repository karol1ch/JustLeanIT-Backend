package com.justLearnIT.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
public class Category {
    private String name;
    private String description;
}
