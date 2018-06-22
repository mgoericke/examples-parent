package de.javamark.java8.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class BasicSortWithLambdaTest {
    @Test
    public void whenSortByName_ResultShouldBeSortedCorrectly() {

        List<Student> students = Arrays.asList(
                new Student("Max", 23),
                new Student("Emma", 21),
                new Student("Klaus", 20)
        );

        students.sort(
                (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));

        assertThat(students.get(0).getName(), equalTo("Emma"));

    }
}
