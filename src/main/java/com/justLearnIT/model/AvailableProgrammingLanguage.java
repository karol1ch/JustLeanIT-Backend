package com.justLearnIT.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
