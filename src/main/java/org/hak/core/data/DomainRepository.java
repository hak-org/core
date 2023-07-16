package org.hak.core.data;

import java.util.Optional;

public interface DomainRepository<KEY, DOMAIN> {

    boolean exists(KEY id);

    DOMAIN create(DOMAIN input);

    Optional<DOMAIN> retrieve(KEY id);

    void update(DOMAIN input);

    void delete(KEY id);

}
