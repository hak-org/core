package org.hak.core.generator;

import java.util.UUID;

public class UuidGenerator implements StringGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
