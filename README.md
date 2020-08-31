# word-counter

Word Counter

1. method that allows you to add words

2. method that returns the count of how many times a given word was added to the word counter

It should also have the following requirements:

- should NOT allow addition of words with non-alphabetic characters

- should treat same words written in different languages as the same word, for example if adding "flower", "flor" (Spanish word for flower) and "blume" (German word for flower) the counting method should return 3.

For the simplicity of the task assume that translation of words will be done via external class provided to you called "Translator" that will have method "translate" accepting word as an argument and it will return English name for it.
