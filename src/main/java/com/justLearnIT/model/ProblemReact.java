package com.justLearnIT.model;

import lombok.Data;

import java.util.List;

@Data
public class ProblemReact {
    private String category;
    private List<String> languages;
    private String username;
    private String problemName;
    private String content;
    private String inputDesc;
    private String outputDesc;
    private String difficulty;
    private List<TestReact> tests;
}
