import com.cognizant.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testConstructor(){
        Animal elephant = new Animal(4,12,false, "Elephant");
        assertEquals(12, elephant.getTopSpeed());
        assertEquals("Elephant", elephant.getName());
        assertEquals(4, elephant.getNumLegs());
        assertFalse(elephant.isEndangered());
    }

    @Test
    public void testGetterSetters(){
        Animal elephant = new Animal(4,12,false, "Elephant");
        elephant.setName("Hello");
        elephant.setEndangered(true);
        assertNotEquals("Elephant", elephant.getName());
        assertTrue(elephant.isEndangered());

    }

}
