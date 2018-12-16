package com.justLearnIT.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

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
    @Column(name = "code_content")
    private String codeContent;
    @Column(name = "compilation_return_code")
    private Integer compilationReturnCode;
    @Column(name = "compilation_stdout")
    private String compilationStdout;
    @Column(name = "compilation_stderr")
    private String compilationStderr;
    @Column(name = "author")
    private String username;
    @ManyToOne
    private Problem problem;
}
