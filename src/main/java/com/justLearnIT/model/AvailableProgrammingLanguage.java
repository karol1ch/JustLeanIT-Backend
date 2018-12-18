package com.justLearnIT.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(AvailableProgrammingLanguagePK.class)
@Table(name = "available_programming_language")
public class AvailableProgrammingLanguage {
    @Id
    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName = "id", nullable = false)
    private Problem problem;
    @Id
    @ManyToOne
    @JoinColumn(name = "programming_language_name", referencedColumnName = "name", nullable = false)
    private ProgrammingLanguage programmingLanguage;
}
