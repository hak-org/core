package org.hak.core.generator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShortUuidGeneratorTest {

    static StringGenerator generator;

    @BeforeAll
    static void setup() {
        generator = new ShortUuidGenerator();
    }

    @Test
    void generate() {
        String actual = generator.generate();
        System.out.println(actual);
    }
}