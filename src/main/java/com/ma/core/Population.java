package com.ma.core;

import java.util.Collection;

public interface Population {
    Collection<Chromosome> getChromosomes();

    void fitness();

    void crossover();

    void mutate();

    Population select();

}
