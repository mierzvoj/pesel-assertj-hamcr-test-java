package HamcrestMatchers;

import org.example.Pesel;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

//Hamcrest custom matchers Validity
public class customMatchValidity extends TypeSafeMatcher<Pesel> {
    @Override
    protected boolean matchesSafely(Pesel pesel) {
        try {
            pesel.isPeselValid();
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }



    @Override
    public void describeTo(Description description) {
        description.appendText("valid output");
    }


    public static Matcher isValid() {
        return new customMatchValidity();
    }
}
