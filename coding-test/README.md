# Basic Java coding test questions :)

## Capitalize first character of a given String

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

And a simple test ....

```
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
```