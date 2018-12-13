package com.justLearnIT.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topic {
    private int id;
    private String name;
    private String theory;
    private Category category;
    private String codeExample;
    private String codeExplanation;
}
