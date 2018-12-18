package com.justLearnIT.dao;

import com.justLearnIT.model.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageDAO {
    ProgrammingLanguage getProgrammingLanguageByName(String name);
}
