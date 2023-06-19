package com.ma.core.algorithm;

import com.ma.core.Population;
import com.ma.core.TerminateCondition;


public class SimpleGeneticAlgorithm {
    private Population prevPopulation;
    private Population population;
    private TerminateCondition terminateCondition;

    public SimpleGeneticAlgorithm(Population population, TerminateCondition terminateCondition) {
        this.prevPopulation = population;
        this.population = population;
        this.terminateCondition = terminateCondition;
    }

    public void execute() {
        long generation = 0;
        population.fitness();
        do {
            prevPopulation = population;
            // 选择
            population = population.select();
            // 交叉
            population.crossover();
            // 突变
            population.mutate();
            // 计算适应度
            population.fitness();

            generation++;
        } while (terminateCondition.terminateCondition(generation, prevPopulation, population));
    }
}
