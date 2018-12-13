package com.justLearnIT.dao;

import com.justLearnIT.model.Category;
import com.justLearnIT.model.Topic;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TopicDAOMocked implements TopicDAO {

    Category java = new Category("Java", null);

    private List<Topic> topics = Arrays.asList(
            new Topic(1, "for loop", "The for statement provides a compact way to iterate over a range of values. Programmers often refer to it as the \"for loop\" because of the way in which it repeatedly loops until a particular condition is satisfied. The general form of the for statement can be expressed as follows:\n" +
                    "\n" +
                    "for (initialization; termination;\n" +
                    "     increment) {\n" +
                    "    statement(s)\n" +
                    "}", java, "class EnhancedForDemo {\n" +
                    "    public static void main(String[] args){\n" +
                    "         int[] numbers = \n" +
                    "             {1,2,3,4,5,6,7,8,9,10};\n" +
                    "         for (int item : numbers) {\n" +
                    "             System.out.println(\"Count is: \" + item);\n" +
                    "         }\n" +
                    "    }\n" +
                    "}",
                    "It's easy."),
            new Topic(2, "if statement", "The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in java.\n" +
                    "\n" +
                    "if statement\n" +
                    "if-else statement\n" +
                    "if-else-if ladder\n" +
                    "nested if statement", java, "//Java Program to demonstate the use of if statement.  \n" +
                    "public class IfExample {  \n" +
                    "public static void main(String[] args) {  \n" +
                    "    //defining an 'age' variable  \n" +
                    "    int age=20;  \n" +
                    "    //checking the age  \n" +
                    "    if(age>18){  \n" +
                    "        System.out.print(\"Age is greater than 18\");  \n" +
                    "    }  \n" +
                    "}  \n" +
                    "}  ",
                    "It's the easiest code example I've ever read.")
    );

    @Override
    public List<Topic> getTopicsByCategoryName(String categoryName) {
        return topics.stream()
                .filter(topic -> topic.getCategory().getName().equals(categoryName))
                .collect(Collectors.toList());
    }

    @Override
    public Topic getTopicById(long topicId) {
        return topics.stream()
                .filter(topic -> topic.getId() == topicId)
                .findFirst()
                .orElse(new Topic(-1, "NOT FOUND", "NOT FOUND", new Category("NOT FOUND", "NOT FOUND"), "NOT FOUND", "NOT FOUND"));
    }
}
