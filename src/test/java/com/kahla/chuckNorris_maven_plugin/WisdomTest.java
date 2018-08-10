package com.kahla.chuckNorris_maven_plugin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WisdomTest {
    
    @Test
    public void testSth() {
        Wisdom wisdom = new Wisdom();
        wisdom.setValue("some Value");
        
        assertEquals(wisdom.getValue(), "some Value");
    }

}
