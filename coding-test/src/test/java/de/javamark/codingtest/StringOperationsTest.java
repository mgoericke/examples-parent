package de.javamark.codingtest;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StringOperationsTest {

    @Test
    public void capitalizeFirstCharacter() {

        // test the whole string
        assertThat(StringOperations.capitalizeFirstCharacter("lower"), equalTo("Lower"));

        // test the first character
        assertThat(StringOperations.capitalizeFirstCharacter("lower").charAt(0), equalTo('L'));
    }
}