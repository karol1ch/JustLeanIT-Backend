package com.justLearnIT.dao;

import com.justLearnIT.model.Category;
import com.justLearnIT.model.Problem;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProblemDAOMocked implements ProblemDAO {

    Category java = new Category("Java", null);

    private List<Problem> problems = Arrays.asList(
            new Problem(1, "first problem", "CONhdsajf uysagfiusag iuhsaiufhau gsgfusagfusagfsahfiusaohfsaoihfhsa fsaffas fsaf",
                    java, "INPUT", "OUTPUT", 276, "easy", "Kalor"),

            new Problem(2, "second problem", "CONhdsajf uysagfiusag iuhsaiufhau gsgfusagfusagfsahfiusaohfsaoihfhsa fsaffas fsaf",
                    java, "INPUT", "OUTPUT", 759874, "difficult", "Ts")
    );


    @Override
    public List<Problem> getProblemsByCategoryName(String category) {
        return problems.stream()
                .filter(problem -> problem.getCategory().getName().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public Problem getProblemById(long problemID) {
        return problems.stream()
                .filter(problem -> problem.getId() == problemID)
                .findAny()
                .orElse(new Problem(-1, "NOT_FOUND", "NOT_FOUND", java, "NOT_FOUND", "NOT_FOUND", -1, "NOT_FOUND", "NOT_FOUND"));
    }
}
