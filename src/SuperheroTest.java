import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {

    @Test
    void setName() {
        Superhero superhero = Factory.createBatman();
        superhero.setName("Веном");
        assertEquals(superhero.getName(), "Веном");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void setName(String emptyAndNull) {
        Superhero superhero = Factory.createBatman();
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            superhero.setLabel(emptyAndNull);
        });
        System.out.println(exception.getMessage());
        Assertions.assertEquals("ExceptionSuperhero: Значения должны быть заполнены", exception.getMessage());
    }

    @Test
    void setStrengthLevel() {
        Superhero superhero = Factory.createBatman();
        superhero.setStrengthLevel(5);
        assertEquals(superhero.getStrengthLevel(), 5);
    }

    @Test
    void setStrengthLevelException() {
        Superhero superhero = Factory.createBatman();
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            superhero.setStrengthLevel(0);
        });
        System.out.println(exception.getMessage());
        Assertions.assertEquals("ExceptionSuperhero: Значения должны быть заполнены", exception.getMessage());
    }

    @Test
    void setLabel() {
        Superhero superhero = Factory.createBatman();
        superhero.setLabel("Marvel");
        assertEquals(superhero.getLabel(), "Marvel");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void setLabel(String emptyAndNull) {
        Superhero superhero = Factory.createBatman();
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            superhero.setLabel(emptyAndNull);
        });
        System.out.println(exception.getMessage());
        Assertions.assertEquals("ExceptionSuperhero: Значения должны быть заполнены", exception.getMessage());
    }

    @Test
    void setHp() {
        Superhero superhero = Factory.createBatman();
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            superhero.setHp(-50);
        });
        System.out.println(exception.getMessage());
        Assertions.assertEquals("ExceptionSuperhero: Значения должны быть заполнены", exception.getMessage());
    }
}