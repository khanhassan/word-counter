package com.company.counter.word.util;

public class Translator {
    public String translate(String word) {
        if (word.equalsIgnoreCase("flor")
                || word.equalsIgnoreCase("blume")) {
            return "flower";
        }
        return word;
    }
}
