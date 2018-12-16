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
class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String content;
    @ManyToOne
    private Category category;
    private String inputDescription;
    private String outputDescription;
    private int numberOfAcceptedSolutions;
    private String difficulty;
    private String userName;
}
