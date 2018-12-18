package com.justLearnIT.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class SubmitResultPK implements Serializable {
    @Id
    @Column(name = "submit_id")
    @JoinColumn(name = "submit_id", referencedColumnName = "id", nullable = false)
    private int submitId;
    @Id
    @ManyToOne
    @JoinColumn(name = "test_id", referencedColumnName = "id", nullable = false)
    private Test test;
}
