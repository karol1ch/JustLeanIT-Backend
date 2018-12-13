package com.justLearnIT.dao;

import com.justLearnIT.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryDAOMocked implements CategoryDAO {

    List<Category> categories = Arrays.asList(
            new Category("Java", "The worst programming language in the world!"),
            new Category("Python", "I don't know what it is doing here..."),
            new Category("C#", "Second Java but made by M$")
    );

    @Override
    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public Category getCategoryByCategoryName(String categoryName) {
        return categories.stream()
                .filter(category -> category.getName().equals(categoryName))
                .findFirst()
                .orElse(new Category("NOT FOUND", "NOT FOUND"));
    }
}
