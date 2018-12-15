package com.justLearnIT.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Submit {
    private int id;
    private boolean processed;
    private String codeContent;
    private Integer compilationReturnCode;
    private String compilationStdout;
    private String compilationStderr;
    private String programmingLanguage;
    private String username;
    private Problem problem;
}
