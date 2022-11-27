package AssertJMatchers;

import org.example.Pesel;
import org.junit.jupiter.api.Test;

import static AssertJMatchers.PeselAssert.assertThat;

public class TestClass {
    @Test
    public void isPeselValid() {
        Pesel pesel = new Pesel("65071209862");
        assertThat(pesel)
                .isValid();
    }

    @Test
    public void peselGenderCheck(){
        Pesel pesel1 = new Pesel("65071209862");
        assertThat(pesel1).customAssertionGenderCheck(pesel1);
    }
}
