package de.javamark.codingtest;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SomethingWithNumbersTest {

    @Test
    public void numbersFromToIncludeFirstAndLast() {
        assertThat(IntStream.rangeClosed(1, 5).toArray(), equalTo(new int[]{1,2,3,4,5}));
    }

    @Test
    public void numbersFromToIncludeFirstExcludeLast() {
        assertThat(IntStream.range(1, 5).toArray(), equalTo(new int[]{1,2,3,4}));
    }

    @Test
    public void numbersFromToReplaceMultiplesOfThreeWith333() {

        // with java stream
        assertThat(IntStream.rangeClosed(1, 6).map(i -> ((i%3)==0?333:i)).toArray(), equalTo(new int[]{1,2,333,4, 5, 333}));

        // with a for loop
        int [] result = new int[6];
        for(int i=1;i<=6; i++) {
            if ((i%3) == 0) {
                result[i-1] = 333;
            } else {
                result[i-1] = i;
            }
        }
        assertThat(result, equalTo(new int[]{1,2,333,4, 5, 333}));
    }

}
