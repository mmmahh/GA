package com.ma.core;

public interface TerminateCondition {
    boolean terminateCondition(long generation, Population prev, Population current);
}
