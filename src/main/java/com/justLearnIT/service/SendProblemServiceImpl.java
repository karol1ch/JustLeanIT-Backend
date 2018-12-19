package com.justLearnIT.service;

import com.justLearnIT.dao.*;
import com.justLearnIT.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SendProblemServiceImpl implements SendProblemService {

    private final CategoryDAO categoryDAO;
    private final ProgrammingLanguageDAO programmingLanguageDAO;
    private final ProblemDAO problemDAO;
    private final AvailableProgrammingLanguageDAO availableProgrammingLanguageDAO;
    private final TestDAO testDAO;

    public SendProblemServiceImpl(@Autowired CategoryDAO categoryDAO,
                                  @Autowired ProgrammingLanguageDAO programmingLanguageDAO,
                                  @Autowired ProblemDAO problemDAO,
                                  @Autowired AvailableProgrammingLanguageDAO availableProgrammingLanguageDAO,
                                  @Autowired TestDAO testDAO) {
        this.categoryDAO = categoryDAO;
        this.programmingLanguageDAO = programmingLanguageDAO;
        this.problemDAO = problemDAO;
        this.availableProgrammingLanguageDAO = availableProgrammingLanguageDAO;
        this.testDAO = testDAO;
    }

    @Override
    public List<Category> getCategories() {
        return categoryDAO.getCategories();
    }

    @Override
    public List<ProgrammingLanguage> getProgrammingLanguagesForCategoryName(String category) {
        ProgrammingLanguage programmingLanguage =
                programmingLanguageDAO.getProgrammingLanguageByName(category);

        if (programmingLanguage == null) {
            return programmingLanguageDAO.getProgrammingLanguages();
        } else {
            return Arrays.asList(programmingLanguage);
        }
    }

    @Override
    public void convertAndSaveProblem(ProblemReact problemReact) {
        Problem problem = Problem.builder()
                .name(problemReact.getProblemName())
                .content(problemReact.getContent())
                .category(categoryDAO.getCategoryByCategoryName(problemReact.getCategory()))
                .inputDescription(problemReact.getInputDesc())
                .outputDescription(problemReact.getOutputDesc())
                .numberOfAcceptedSolutions(0)
                .difficulty(problemReact.getDifficulty())
                .username(problemReact.getUsername())
                .build();

        problemDAO.save(problem);

        for (String language : problemReact.getLanguages()) {
            ProgrammingLanguage lang = programmingLanguageDAO.getProgrammingLanguageByName(language);
            availableProgrammingLanguageDAO.save(new AvailableProgrammingLanguage(problemDAO.getProblemById(problem.getId()), lang));
        }

        for (TestReact testReact : problemReact.getTests()) {
            Test test = Test.builder()
                    .number(testReact.getNumber())
                    .isOpen(false)
                    .input(testReact.getInput())
                    .output(testReact.getOutput())
                    .problem(problem)
                    .maximumExecutionTimeMs(testReact.getMaxExecutionTimeMs())
                    .build();

            testDAO.save(test);
        }
    }
}
