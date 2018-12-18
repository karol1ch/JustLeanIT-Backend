package com.justLearnIT.dao;

import com.justLearnIT.model.Submit;

import java.util.List;

public interface SubmitDAO {
    List<Submit> getSubmits();

    Submit getSubmitBySubmitId(long submitId);
    void saveOrUpdate(Submit submit);
}
