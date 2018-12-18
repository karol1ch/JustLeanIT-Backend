package com.justLearnIT.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(SubmitResultPK.class)
@Table(name = "submit_result")
public class SubmitResult {
    @Id
    @Column(name = "submit_id")
    private int submitId;
    @Id
    @ManyToOne
    @JoinColumn(name = "test_id", referencedColumnName = "id", nullable = false)
    private Test test;
    @Column(name = "execution_return_code")
    private Integer executionReturnCode;
    @Column(name = "execution_stdout")
    private String executionStdout;
    @Column(name = "execution_stderr")
    private String executionStderr;
    @Column(name = "execution_time_ms")
    private Integer executionTimeMs;
    private String status;
}
