# Basic Java coding test questions :)

## Capitalize first character of a given String

[StringOperation implementation](https://github.com/mgoericke/examples-parent/blob/9f4d73357916945f8a56f0e5ff9bec34fd8d5778/coding-test/src/main/java/de/javamark/codingtest/StringOperations.java#L3)

```
package de.javamark.codingtest;

public class StringOperations {

    public static String capitalizeFirstCharacter(final String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("method awaits a string (min length 2) as input");
        }
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }

}

```

[And a simple test .... ](https://github.com/mgoericke/examples-parent/blob/9f4d73357916945f8a56f0e5ff9bec34fd8d5778/coding-test/src/test/java/de/javamark/codingtest/StringOperationsTest.java#L8)

```
package de.javamark.codingtest;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StringOperationsTest {

    @Test
    public void firstCharacterShouldBeUpperCaseTheRestOfTheStringRemainTheSame() {
        // test the whole string
        assertThat(StringOperations.capitalizeFirstCharacter("lower"), equalTo("Lower"));
    }

    @Test
    public void firstCharacterShouldBeUpperCase() {
        // test the first character
        assertThat(StringOperations.capitalizeFirstCharacter("lower").charAt(0), equalTo('L'));
    }
}
```