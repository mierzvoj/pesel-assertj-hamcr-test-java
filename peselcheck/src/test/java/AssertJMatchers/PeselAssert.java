package AssertJMatchers;

import org.assertj.core.api.AbstractAssert;
import org.example.Pesel;
import org.hamcrest.Description;
import org.junit.Test;

import static jdk.dynalink.linker.support.Guards.isNotNull;

//Assertj custom matchers
public class PeselAssert extends AbstractAssert<PeselAssert, Pesel> {

    Pesel pesel = new Pesel("");
    public PeselAssert(Pesel actual) {
        super(actual, PeselAssert.class);
    }

    public static PeselAssert assertThat(Pesel actual) {
        return new PeselAssert(actual);
    }


    public PeselAssert isValid() {
        isNotNull();
        if (actual.isPeselValid()) {
            System.out.println("Valid Pesel");
        }
        return this;
    }

    public void describeTo(Description description) {
        description.appendText("everything is ok");
    }


    public PeselAssert customAssertionGenderCheck(Pesel pesel) {
        String gender = "female";
        isNotNull();
        if (!pesel.maleOrFemale().equals(gender)) {
            failWithMessage("Expected person to have gender %s but was %s",
                    gender, pesel.maleOrFemale());
        }
        return this;
    }


}
