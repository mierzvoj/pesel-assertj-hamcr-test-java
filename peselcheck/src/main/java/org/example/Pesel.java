package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;

public class Pesel {
    private String pesel;


    public Pesel(String pesel) {
        this.pesel = pesel;
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

        int sum = 9 * A1 + 7 * B2 + 3 * C3 + 1 * D4 + 9 * E5 + 7 * F6 + 3 * G7 + 1 * H8 + 9 * I9 + 7 * J10;

        if (sum % 10 == lastDigit) {
            System.out.println("Valid PESEL");
            return true;
        } else {
            System.out.println("Invalid PESEL");
            return false;
        }
    }

    public List<String> breakDownPeselToCheck() {

        if (isPeselValid()) {
            List<String> listOfData = new ArrayList();
            Integer monthOfBirthFromPesel = Integer.parseInt(pesel.substring(2, 4));
            Integer centuryOfBirthYear = monthOfBirthFromPesel / 20;
            Integer monthOfBirth = monthOfBirthFromPesel - (centuryOfBirthYear * 20);
            String century = null;
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

            String yearOfBirth = century + pesel.substring(0, 2);

            String dayOfBirth = pesel.substring(4, 6);

            System.out.printf("Birth Year: %s\n", yearOfBirth);
            System.out.printf("Month of Birth: %02d\n", monthOfBirth);
            System.out.printf("Day of Birth: %s\n", dayOfBirth);
            System.out.printf("Sex: %s\n", maleOrFemale());
            String monthOfBirthString = Integer.toString(monthOfBirth);
            listOfData.add(yearOfBirth);
            listOfData.add(monthOfBirthString);
            listOfData.add(dayOfBirth);
            System.out.println(Arrays.toString(listOfData.toArray()));
            return listOfData;
        } else {
            System.out.println("Checksum Inproper");
        }
        return null;
    }

    public String maleOrFemale() {
        if (isPeselValid()) {
            int plec = Integer.parseInt(pesel.substring(9, 10));
            if (plec % 2 == 0 || plec == 0) {
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
}