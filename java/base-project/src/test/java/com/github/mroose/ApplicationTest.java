package com.github.mroose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testHelloWorld() {
        var actual = "Hello World";
        var expected = "Hello World";
        assertThat(actual).isEqualTo(expected);
    }
}