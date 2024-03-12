package review.example.v12;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {
    public static void main(String[] args) {
        System.out.println("Compact Formatting is:");
        NumberFormat upvotes = NumberFormat.getCompactNumberInstance(
                new Locale("en", "US"), NumberFormat.Style.SHORT);

        System.out.println(upvotes.format(100));
        System.out.println(upvotes.format(1000));
        System.out.println(upvotes.format(10000));
        System.out.println(upvotes.format(100000));
        System.out.println(upvotes.format(1000000));



        // set digit
        System.out.println("==== set digit ====");
        upvotes.setMaximumFractionDigits(4);
        System.out.println(upvotes.format(1234));
        System.out.println(upvotes.format(123456));
        System.out.println(upvotes.format(12345678));



        Locale locIndia = new Locale("en", "IN");
        printCompactFormat(1234, locIndia);

        printCompactFormat(1234, Locale.US);

        printCompactFormat(12345, Locale.GERMANY);

        printCompactFormat(1234, Locale.JAPANESE);

        printCompactFormat(1234, Locale.TRADITIONAL_CHINESE);

        printCompactFormat(234567, Locale.FRANCE);

        printCompactFormat(1234567, Locale.KOREA);
    }

    private static void printCompactFormat(int number, Locale locale) {
        NumberFormat compactFormatShort = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
        System.out.println(locale.getDisplayName() + " Short: " + compactFormatShort.format(number));
    }
}
