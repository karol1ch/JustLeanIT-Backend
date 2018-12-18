package com.justLearnIT.dao;

import com.justLearnIT.model.ProgrammingLanguage;

public interface ProgrammingLanguageDAO {
    ProgrammingLanguage getProgrammingLanguageByName(String name);
}
