import org.example.Pesel;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {
    Boolean checkIfValid = true;
    Pesel pesel = new Pesel("65071209862");

    @BeforeEach
    void setUp(){}

    @Test
    public void testGender(){
        String str = pesel.maleOrFemale();
        assertEquals("female", str );

    }

    @Test
    public void testDay(){
        assertEquals("12", pesel.breakDownPeselToCheck().get(2));

    }

    @Test
    public void testMonth(){
        assertEquals("7", pesel.breakDownPeselToCheck().get(1));

    }

    @Test
    public void testYear(){
        assertEquals("1965", pesel.breakDownPeselToCheck().get(0));

    }


    @Test
    public void testPESEL(){
            assertEquals(checkIfValid, pesel.isPeselValid());

    }

}
