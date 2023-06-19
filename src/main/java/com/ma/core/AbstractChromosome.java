package com.ma.core;

import org.springframework.lang.NonNull;

import java.util.Objects;
import java.util.UUID;

public abstract class AbstractChromosome implements Chromosome {
    @NonNull
    protected String identity;

    protected AbstractChromosome() {
        this.identity = UUID.randomUUID().toString();
    }

    @Override
    public String identity() {
        return this.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.identity);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof AbstractChromosome)) {
            return false;
        }

        AbstractChromosome that = (AbstractChromosome) object;
        return Objects.equals(this.identity, that.identity);
    }
}
