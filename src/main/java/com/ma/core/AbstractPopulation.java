package com.ma.core;

import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPopulation implements Population {
    protected Collection<Chromosome> chromosomes;

    protected Map<Chromosome, FitnessValue> fitnessValueMap;

    protected AbstractPopulation(@NonNull Collection<Chromosome> chromosomes) {
        this.chromosomes = chromosomes;
        this.fitnessValueMap = new HashMap<>();
        for (Chromosome chromosome : chromosomes) {
            fitnessValueMap.put(chromosome, null);
        }
    }

    @Override
    public Collection<Chromosome> getChromosomes() {
        return this.chromosomes;
    }

}
