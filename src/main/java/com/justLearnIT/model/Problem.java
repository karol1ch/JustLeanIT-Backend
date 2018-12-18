package com.justLearnIT.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String content;
    @ManyToOne
    private Category category;
    @Column(name = "input_description")
    private String inputDescription;
    @Column(name = "output_description")
    private String outputDescription;
    @Column(name = "number_of_accepted_solutions")
    private int numberOfAcceptedSolutions;
    private String difficulty;
    @Column(name = "author")
    private String username;
}
