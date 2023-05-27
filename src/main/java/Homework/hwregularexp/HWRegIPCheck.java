package Homework.hwregularexp;

import java.util.regex.Pattern;

public class HWRegIPCheck {

    public static void main(String[] args) {

        String ip1 = "000.14.33.156";
        System.out.println(ip1 + "  - validation... " + isValidIP(ip1));

        String ip2 = "0.0.0.0";
        System.out.println(ip2 + "  - validation... " + isValidIP(ip2));

        String ip3 = "00.1.23.23.23";
        System.out.println(ip3 + "  - validation... " + isValidIP(ip3));

        String ip4 = "i.am.not.an.ip";
        System.out.println(ip4 + "  - validation... " + isValidIP(ip4));
    }

    private static boolean isValidIP(String ip) {
        String regDigit = "(\\d{1,2}|(0|1)\\d{2}|2[0-4][0-9]|25[0-5])";
        String regexNew = "(" + regDigit + "\\." + "){3}" + regDigit;
        Pattern pattern = Pattern.compile(regexNew);
        return pattern.matcher(ip).matches();
    }
}
