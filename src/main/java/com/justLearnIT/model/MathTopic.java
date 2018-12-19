package com.justLearnIT.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "math_topic")
public class MathTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String theory;
    @ManyToOne
    @JoinColumn(name = "math_category_name")
    private MathCategory category;
    private String homework;
    private String clue;
    private String answer;
}
