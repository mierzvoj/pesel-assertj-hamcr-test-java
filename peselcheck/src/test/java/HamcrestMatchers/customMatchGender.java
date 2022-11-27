package HamcrestMatchers;

import org.example.Pesel;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class customMatchGender extends TypeSafeMatcher<Pesel> {
    @Override
    protected boolean matchesSafely(Pesel pesel) {
        try {
            pesel.maleOrFemale();
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }



    @Override
    public void describeTo(Description description) {
        description.appendText("valid output");
    }


    public static Matcher maleOrFemale() {
        return new customMatchGender();
    }
}
