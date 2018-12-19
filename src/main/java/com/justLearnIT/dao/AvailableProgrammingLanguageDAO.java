package com.justLearnIT.dao;

import com.justLearnIT.model.AvailableProgrammingLanguage;
import com.justLearnIT.model.ProgrammingLanguage;

import java.util.List;

public interface AvailableProgrammingLanguageDAO {
    List<ProgrammingLanguage> getAvailableProgrammingLanguagesForProblem(int problemID);

    void save(AvailableProgrammingLanguage availableProgrammingLanguage);
}
