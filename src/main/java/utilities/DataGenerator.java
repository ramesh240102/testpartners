package utilities;

import io.codearte.jfairy.Fairy;

import java.util.Random;
import java.util.stream.Collectors;


public class DataGenerator {

    static Fairy dataGenerator = Fairy.create();

    public static String getRandomString() {
        int length = 12;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz";

        String str = new Random().ints(length, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());
        return str;
    }

    public static String getRandomFirstName() {
        return dataGenerator.person().firstName();
    }

    public static String getRandomLastName() {
        return dataGenerator.person().lastName();
    }

    public static String getRandomMiddleName() {
        return dataGenerator.person().middleName();
    }

    public static String getRandomEmail() {
        return dataGenerator.person().email();
    }

    public static String getRandomStreet() {
        return dataGenerator.person().getAddress().street();
    }


    public static <T> T getValueOrDefault(T value, T defaultValue) {
        return (value == null || value.equals("")) ? defaultValue : value;
    }


}
