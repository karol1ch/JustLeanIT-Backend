package com.justLearnIT.model;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class AvailableProgrammingLanguagePK implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName = "id", nullable = false)
    private Problem problem;
    @Id
    @ManyToOne
    @JoinColumn(name = "programming_language_name", referencedColumnName = "name", nullable = false)
    private ProgrammingLanguage programmingLanguage;
}
