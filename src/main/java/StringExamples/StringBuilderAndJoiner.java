package StringExamples;

import java.util.StringJoiner;

public class StringBuilderAndJoiner {

    public static void main(String[] args) {
        String str = "string";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);
        stringBuilder.append(" new");
        System.out.println(stringBuilder);
        char char4 = stringBuilder.charAt(1);
        System.out.println(char4);
        stringBuilder.delete(2, 5);
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
        stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);
        int indexOf3 = stringBuilder.indexOf("in");
        System.out.println(indexOf3);
        stringBuilder.insert(3, "WWW");
        System.out.println(stringBuilder);
        int indexOf4 = stringBuilder.lastIndexOf("asd");
        System.out.println(indexOf4);
        stringBuilder.replace(0, 1, "Hee");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'A');
        System.out.println(stringBuilder);
        String str10 = stringBuilder.substring(0, 5);
        System.out.println(str10 + "\n");
        
        
        StringJoiner sj = new StringJoiner(":", "[", "]");
        System.out.println(sj);
        sj.setEmptyValue("netu");
        System.out.println(sj);
        sj.add("George").add("Sally").add("Fred");
        String desiredString = sj.toString();
        System.out.println(desiredString);
    }

}
