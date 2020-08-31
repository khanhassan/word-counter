package com.company.counter.word;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.company.counter.word.util.Translator;
import org.junit.Test;

public class TranslatorTest {
    @Test
    public void shouldTranslateSpanishToEnglish() {
        Translator translator = new Translator();
        String result = translator.translate("flor");
        assertThat(result, is("flower"));
    }

    @Test
    public void shouldTranslateGermanToEnglish() {
        Translator translator = new Translator();
        String result = translator.translate("blume");
        assertThat(result, is("flower"));
    }
}
