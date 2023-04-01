package org.ejercicio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransformWordsServiceTest {

    @Test
    void transformOneWord() {
        String result = TransformWordsService.transform("hello");
        Assertions.assertEquals("ellohay", result);
    }

    @Test
    void transformTwoWords() {
        String result = TransformWordsService.transform("hello hello");
        Assertions.assertEquals("ellohay ellohay", result);
    }

    @Test
    void transformNoWord() {
        String result = TransformWordsService.transform("");
        Assertions.assertEquals("", result);
    }
}