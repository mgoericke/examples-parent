package de.javamark.java8.model;

public class Student {
    private final String name;
    private final Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    /**
     * compare left hand side with right hand side object:
     * used for comparision of objects:
     *  * sort by name
     *  * then sort by age
     * @param lhs
     * @param rhs
     * @return
     */
    public static int compareByNameThenByAge(Student lhs, Student rhs){
        if(lhs.name.equals(rhs.name)) {
            return lhs.age - rhs.age;
        } else {
            return lhs.name.compareTo(rhs.name);
        }
    }
}
