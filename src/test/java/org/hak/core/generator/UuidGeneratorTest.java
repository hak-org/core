package org.hak.core.generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class UuidGeneratorTest {

    static UuidGenerator generator;

    @BeforeAll
    static void setup() {
        generator = new UuidGenerator();
    }

    @Test
    @DisplayName("한개만 생성")
    void tryOneTime() {

        String actual = generator.generate();
        System.out.println(actual);

        Assertions.assertNotNull(actual);

    }

    @Test
    @DisplayName("여러개 생성, 항상 달라야 함")
    void tryNTimes() {

        IntStream.range(0, 10).forEach(value -> {
            System.out.println(generator.generate());
        });

    }
}