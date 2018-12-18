package com.justLearnIT.dao;

import com.justLearnIT.model.Submit;
import com.justLearnIT.model.SubmitResult;

import java.util.List;

public interface SubmitResultDAO {
    List<SubmitResult> getAllSubmitResultsBySubmitId(Submit submitId);
}
