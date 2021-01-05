package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexExExample1 {

    public static void main(String[] args) {
        // findLetter();

        // findWord();

        // example();

        // example2();

        // example3();

        // example4();

        // example5();

       // splitPattern();
        
        getPattern();
    }

    public static void findLetter() {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("Jack is a boy");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }

    public static void findWord() {
        Pattern pattern = Pattern.compile("cat");
        Matcher matcher = pattern.matcher("About cats and dogs");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }

    public static void example() {
        Pattern pattern = Pattern.compile("\\Q1+1=2\\E"); // Everything between \Q.....\E will be perceived as written,
                                                          // even though + is a special symbol
        Matcher matcher = pattern.matcher("1+1=2"); // and without \Q.....\E we have to write not "\\Q1+1=2\\E" but
                                                    // "1\+1=2"
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }

    public static void example2() {
        Pattern pattern = Pattern.compile("[\\Q1+1=2\\E]");
        Matcher matcher = pattern.matcher("1+1=2");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }

    public static void example3() {
        Pattern pattern = Pattern.compile("cat");
        Matcher matcher = pattern.matcher("About cats and dogs and catfish");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println();
    }

    public static void example4() {
        String text = "you";
        String pattern = "you";
        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
    }

    public static void example5() {
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
