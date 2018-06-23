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

    @Test
    public void givenLambdaShortForm_whenSortByName_ResultShouldBeSortedCorrectly() {

        List<Student> students = Arrays.asList(
                new Student("Max", 23),
                new Student("Emma", 21),
                new Student("Klaus", 20)
        );

        // same as above but without type definitions
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        assertThat(students.get(0).getName(), equalTo("Emma"));
    }

    @Test
    public void givenStaticMethod_compareByNameThenByAge_shouldSortCorrectly() {

        List<Student> students = Arrays.asList(
                new Student("Max", 23),
                new Student("Emma", 21),
                new Student("Emma", 19),
                new Student("Klaus", 20)
        );

        // sort with static method
        students.sort(Student::compareByNameThenByAge);

        assertThat(students.get(0).getName(), equalTo("Emma"));
        assertThat(students.get(0).getAge(), equalTo(19));


    }
}
