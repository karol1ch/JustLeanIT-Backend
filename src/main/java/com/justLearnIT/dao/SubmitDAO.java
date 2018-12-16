package com.justLearnIT.dao;

import com.justLearnIT.model.Submit;

import java.util.List;

public interface SubmitDAO {
    List<Submit> getSubmits();

    Submit getSubmitBySubmitId(int submitId);
    void saveOrUpdate(Submit submit);
}
