package com.justLearnIT.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Problem {
    private int id;
    private String name;
    private String content;
    private Category category;
    private String inputDescription;
    private String outputDescription;
    private int numberOfAcceptedSolutions;
    private String difficulty;
    private String userName;
}
