package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedTest {
    private String name;
    private Animal animal;

    public ParametrizedTest(Animal animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[]{new Dog(), "I'am a dog"});
        result.add(new Object[]{new Cat(), "I'am a cat"});
        result.add(new Object[]{new Pig(), "I'am a pig"});
        return result;
    }

    @Test
    public void animalTest() {
        assertEquals(name, animal.whoIam());
    }
}
