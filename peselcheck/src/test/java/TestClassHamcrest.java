

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.example.Pesel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestClassHamcrest {
    Pesel pesel = new Pesel("65071209862");

    @Before
    public void setUp() {
    }

    @Test
    public void checkIfpeselHasFig() {
        List<String> str = pesel.peseLlAsList();
        assertThat(str, hasItem("5"));
    }


    @Test
    public void checkPeselMonth() {
        Pesel str = pesel;
        assertThat(str.monthOfBirth(), equalTo(7));
    }

    @Test
    public void checkPeselYear() {
        Pesel str = pesel;
        assertThat(str.yearOfBirth(), equalTo("65"));
    }

    @Test
    public void checkPeselDay() {
        Pesel str = pesel;
        assertThat(str.dayOfBirth(), equalTo("12"));
    }

    @Test
    public void peselToStringAndCorrect() {
        Pesel pes = pesel;
        String str = pesel.getPesel();
        assertThat(pes, hasToString(str));
    }


    @Test
    public void collectionNotEmpty() {
        Pesel pesel = new Pesel("65071209862");
        List<String> peselList = pesel.peseLlAsList();
        assertThat(peselList, hasSize(11));
    }

    @Test
    public void checkListAndValues() {
        String[] hamcrestMatchers = {
                "65071209862", "02271409867", "02271409862"};
        assertThat(hamcrestMatchers,
                hasItemInArray("02271409867"));
    }
}


