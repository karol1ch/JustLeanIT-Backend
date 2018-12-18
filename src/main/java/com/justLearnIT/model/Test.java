package com.justLearnIT.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int number;
    @Column(name = "is_open")
    private boolean isOpen;
    private String input;
    private String output;
    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName = "id", nullable = false)
    private Problem problem;
    @Column(name = "maximum_execution_time_ms")
    private int maximumExecutionTimeMs;
}