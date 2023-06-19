package com.ma.core.operator;

import com.ma.core.Chromosome;

public interface Crossover {
    void crossover(Chromosome ch1, Chromosome ch2);
}
