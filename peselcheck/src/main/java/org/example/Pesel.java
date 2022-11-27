package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;

public class Pesel {
    private final String pesel;
    String century = this.century;
    List<String> myList;

    public Pesel(String pesel) {
        this.pesel = pesel;
        this.century = century;
    }

    public List<String> peseLlAsList(){
        return myList = new ArrayList<String>(Arrays.asList(pesel.split("")));

    }

    public boolean isPeselValid() {
        String pesel = this.pesel;


        int lastDigit = Integer.parseInt(pesel.substring(10, 11));
        int A1 = Integer.parseInt(pesel.substring(0, 1));
        int B2 = Integer.parseInt(pesel.substring(1, 2));
        int C3 = Integer.parseInt(pesel.substring(2, 3));
        int D4 = Integer.parseInt(pesel.substring(3, 4));
        int E5 = Integer.parseInt(pesel.substring(4, 5));
        int F6 = Integer.parseInt(pesel.substring(5, 6));
        int G7 = Integer.parseInt(pesel.substring(6, 7));
        int H8 = Integer.parseInt(pesel.substring(7, 8));
        int I9 = Integer.parseInt(pesel.substring(8, 9));
        int J10 = Integer.parseInt(pesel.substring(9, 10));

        int sum = 9 * A1 + 7 * B2 + 3 * C3 + D4 + 9 * E5 + 7 * F6 + 3 * G7 + H8 + 9 * I9 + 7 * J10;

        if (sum % 10 == lastDigit) {
            System.out.println("Valid PESEL");
            return true;
        } else {
            System.out.println("Invalid PESEL");
            return false;
        }
    }

    public String breakDownPeselToCheck() {

        if (isPeselValid()) {
            List<String> listOfData = new ArrayList();
            Integer monthOfBirthFromPesel = Integer.parseInt(pesel.substring(2, 4));
            Integer centuryOfBirthYear = monthOfBirthFromPesel / 20;


            switch (centuryOfBirthYear) {
                case 0:
                    century = "19";
                    break;
                case 1:
                    century = "20";
                    break;
                case 2:
                    century = "21";
                    break;
                case 3:
                    century = "22";
                    break;
                case 4:
                    century = "18";
                    break;
            }

        }
        return century;
    }

    public String yearOfBirth() {
        String yearOfBirth = pesel.substring(0, 2);
        System.out.printf("Birth Year: %s\n", yearOfBirth);
        return yearOfBirth;
    }

    public Integer monthOfBirth() {
        Integer monthOfBirthFromPesel = Integer.parseInt(pesel.substring(2, 4));
        Integer centuryOfBirthYear = monthOfBirthFromPesel / 20;
        Integer monthOfBirth = monthOfBirthFromPesel - (centuryOfBirthYear * 20);
        System.out.printf("Month of Birth: %s\n", monthOfBirth);
        return monthOfBirth;
    }

    public String dayOfBirth() {
        String dayOfBirth = pesel.substring(4, 6);
        System.out.printf("Day of Birth: %s\n", dayOfBirth);
        return dayOfBirth;
    }


    public String maleOrFemale() {
        if (isPeselValid()) {
            int sex = Integer.parseInt(pesel.substring(9, 10));
            if (sex % 2 == 0 || sex == 0) {
                return "female";
            } else {
                return "male";
            }
        } else {
            return "Gender can not be determined";
        }
    }

    public String getPesel() {
        return pesel;
    }

    public int peselLenght(){
        return pesel.length();
    }

    @Override
    public String toString() {
        return pesel;
    }
}


