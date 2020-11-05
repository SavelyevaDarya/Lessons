package com.practicallesson.figures;

public interface Utils {
    default String toString(Points list) {
        return String.valueOf(list);
    }

    default int sqr(int a) {
        return a * a;
    }
}
