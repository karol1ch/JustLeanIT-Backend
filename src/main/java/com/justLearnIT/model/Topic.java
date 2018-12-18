package com.justLearnIT.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String theory;
    @ManyToOne
    private Category category;
    @Column(name = "code_example")
    private String codeExample;
    @Column(name = "code_explanation")
    private String codeExplanation;
}
