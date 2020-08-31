package com.company.counter.word;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.company.counter.word.util.Translator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WordCounterTest {
    @InjectMocks
    private WordCounter wordCounter;
    @Mock
    private Translator translator;

    @Test
    public void shouldAddWord() {
        when(translator.translate(anyString())).thenReturn("flower");

        wordCounter.addWord("flower");
        wordCounter.addWord("flor");
        wordCounter.addWord("blume");

        assertThat(wordCounter.getCount("flower"), is(3));
        verify(translator, times(4)).translate(anyString());
    }
}
