import org.example.Pesel;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class Assertions {

    Pesel pesel = new Pesel("65071209862");
    public static PeselAssert assertThat (Pesel actual){
        return new PeselAssert(actual);

    }

    @Test
    public void customAssertionIsPeselValid(){
        Pesel pesel1 = new Pesel("65071209862");
        assertThat(pesel).isValid(pesel1);
    }

    @Test
    public void customAssertionIsPeselInValid(){
        Pesel pesel1 = new Pesel("1234567");
        assertNotEquals(pesel1, pesel);
    }

}
