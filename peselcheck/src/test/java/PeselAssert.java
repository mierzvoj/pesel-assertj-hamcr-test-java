
import org.assertj.core.api.AbstractAssert;
import org.example.Pesel;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PeselAssert extends AbstractAssert<PeselAssert, Pesel> {

    Pesel pesel = new Pesel("65071209862");

    public PeselAssert(Pesel actual) {
        super(actual, PeselAssert.class);
    }

    public static PeselAssert assertThat(Pesel actual) {
        return new PeselAssert(actual);
    }

    public PeselAssert isValid(Pesel pesel) {
        isNotNull();
        if (actual.isPeselValid()) {
            System.out.println("Valid Pesel");
        }

        return this;

    }
}
