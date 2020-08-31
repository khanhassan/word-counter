package com.company.counter.word;

import java.util.HashMap;
import java.util.Map;

import com.company.counter.word.util.Translator;

public class WordCounter {
    private Map<String, Integer> words;
    private Translator translator;

    public WordCounter(Translator translator) {
        this.words = new HashMap<String, Integer>();
        this.translator = translator;
    }

    public void addWord(final String word) {
        final String translatedWord = translator.translate(word);
        if (words.get(translatedWord) == null) {
            words.put(translatedWord, 1);
        } else {
            words.put(translatedWord, words.get(translatedWord) + 1);
        }
    }

    public int getCount(final String word) {
        return words.get(translator.translate(word));
    }
}
