package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExampler {

    public static void main(String[] args) {
//        example();
//
//        example2();
//
//        example3();
//
//        splitPattern();

 //       getPattern();
    }

    public static void example() {
        String text = "you";
        String pattern = "you";
        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
    }

    public static void example2() {
        String text = "This is the text to be searched " + "for occurrences of the pattern.";
        String pattern = ".*is.*";
        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
    }

    public static void example3() {
        String text = "This is the text to be searched for occurrences of the http:// pattern.";

        String patternString = ".*http://.*";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
        System.out.println("matches = " + matches);
    }

    public static void splitPattern() {
        String text = "A sep Text sep With sep Many sep Separators";
        String patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);
        String[] split = pattern.split(text);
        System.out.println("split.length = " + split.length);
        for (String element : split) {
            System.out.println("element = " + element);
        }
    }

    public static void getPattern() {
        String patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);

        String pattern2 = pattern.pattern();
        System.out.println(pattern2);
    }

}
