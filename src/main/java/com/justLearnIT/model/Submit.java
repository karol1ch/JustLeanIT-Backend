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
public class Submit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private boolean processed;
    private String codeContent;
    private Integer compilationReturnCode;
    private String compilationStdout;
    private String compilationStderr;
    private String userName;
    @ManyToOne
    private Problem problem;
}
