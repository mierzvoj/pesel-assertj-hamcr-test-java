
import org.example.Pesel;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TestClassAssertJ {
    Pesel pesel = new Pesel("65071209862");

    @Before
    public void setUp() {
    }


    @Test
    public void contentTest() {
        List list = pesel.peseLlAsList();
        assertThat(list).isNotEmpty().contains("7").doesNotContainNull().containsSequence("0", "9");
    }

    @Test
    public void contentExtendedTest() {
        Pesel pesel1 = new Pesel("1234567890");
        List list = pesel1.peseLlAsList();
        assertThat(list).isNotEmpty()
                .hasSize(10)
                .doesNotHaveDuplicates()
                .contains("6", "9", "7", "8", "2")
                .endsWith("0")
                .startsWith("1")
                .containsSequence("7", "8")
                .containsExactly("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
    }

    @Test
    public void equalityTest() {
        Pesel pesel1 = new Pesel("12345678901");
        assertThat(pesel1.getPesel()).isEqualTo("12345678901");

    }

    @Test
    public void inEqualityTest() {
        Pesel pesel1 = new Pesel("12345678901");
        Pesel pesel2 = new Pesel("22345678901");
        assertThat(pesel1).isNotEqualTo(pesel2);

    }

    @Test
    public void shouldContainOnlyDigits() {
        Pesel pesel1 = new Pesel("11111111111");
        String pesel2 = pesel1.getPesel();
        assertThat(pesel2).containsOnlyDigits();

    }


}
