package HamcrestMatchers;


import org.example.Pesel;
import org.junit.Test;


import static HamcrestMatchers.customMatchValidity.isValid;
import static HamcrestMatchers.customMatchGender.maleOrFemale;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestClassHamcrest {


    @Test
    public void isPeselValid() {
        Pesel pesel = new Pesel("65071209862");
        assertThat(pesel, isValid());
    }

    @Test
    public void maleOrFemale(){
        Pesel pesel = new Pesel("65071209862");
        assertThat(pesel, customMatchGender.maleOrFemale());
    }


}


