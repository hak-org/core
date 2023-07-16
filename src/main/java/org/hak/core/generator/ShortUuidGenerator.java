package org.hak.core.generator;

import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.UUID;

public class ShortUuidGenerator implements StringGenerator {

    @Override
    public String generate() {
        UUID uuid = UUID.randomUUID();
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[16])
                .putLong(uuid.getMostSignificantBits())
                .putLong(uuid.getLeastSignificantBits());
        return Base64.getUrlEncoder().withoutPadding().encodeToString(byteBuffer.array());
    }
}
