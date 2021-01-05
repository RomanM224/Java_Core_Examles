package OptionalExml;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MyOptional {

    public static void main(String[] args) {
      //   createOptional();

        // createOptionalWithNull();

        // ifPresentOptional();

        // orElseOrElseGerNull();

        // orElseOrElseGerNull2();

        // orElseOrElseGer();

        // orElseThrowOptional();

        // getOptional();

        // filterOptional();

        // filterOptional2();

        // mapOptional();

        // mapOptional2();

        // mapOptional3();

        // flatMapOptional();

        // givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturned();

       // givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturnedAndRestNotEvaluated();
        
       // givenTwoOptionalsReturnedByOneArgMethod_whenChaining_thenFirstNonEmptyIsReturned();
    }

    public static String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    public static void createOptional() {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); // false

        String name = "baeldung";
        Optional<String> optional = Optional.of(name);
        System.out.println(optional.isPresent()); // true
    }

    public static void createOptionalWithNull() {
        String nameNull = null;
        // Optional.of(nameNull); //throw NullPointerException

        Optional<String> optionalNull = Optional.ofNullable(nameNull);
        System.out.println(optionalNull.isPresent()); // false

        String name = "baeldung";
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent()); // true
    }

    public static void ifPresentOptional() {
        Optional<String> opt = Optional.of("baeldung");
        opt.ifPresent(name -> System.out.println(name.length()));
    }

    public static void orElseOrElseGerNull() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        String name2 = Optional.ofNullable(nullName).orElseGet(() -> "john");
        System.out.println(name);
        System.out.println(name2);
    }

    public static void orElseOrElseGerNull2() {
        String text = null;
        String defaultText = Optional.ofNullable(text).orElseGet(MyOptional::getMyDefault);
        String defaultText2 = Optional.ofNullable(text).orElse(getMyDefault());

        System.out.println(defaultText);
        System.out.println(defaultText2);
    }

    public static void orElseOrElseGer() {
        String text = "Text present";

        System.out.println("Using orElseGet:");
        String defaultText = Optional.ofNullable(text).orElseGet(MyOptional::getMyDefault);
        System.out.println(defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        System.out.println(defaultText);
    }

    public static void orElseThrowOptional() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
    }

    public static void getOptional() {
        Optional<String> optional = Optional.of("baeldung");
        String name = optional.get();
        System.out.println(name);
        Optional<String> optional2 = Optional.ofNullable(null);
        String name2 = optional2.get(); // Throw NoSuchElementException
        System.out.println(name2);
    }

    public static void filterOptional() {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
        Integer myYear = yearOptional.filter(y -> y == 2016).get();
        System.out.println(is2016 + " " + myYear);

        boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
        Integer myYear2 = yearOptional.filter(y -> y == 2017).get(); // Throw NoSuchElementException
        System.out.println(is2016 + " " + myYear2);
    }

    public static boolean priceIsInRange(Modem modem) {
        return Optional.ofNullable(modem).map(Modem::getPrice).filter(p -> p >= 10).filter(p -> p <= 15).isPresent();
    }

    public static void filterOptional2() {
        System.out.println(priceIsInRange(new Modem(10.0)));
        System.out.println(priceIsInRange(new Modem(9.9)));
        System.out.println(priceIsInRange(new Modem(null)));
        System.out.println(priceIsInRange(new Modem(15.5)));
        System.out.println(priceIsInRange(null));
    }

    public static void mapOptional() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional.map(List::size).orElse(0);
        System.out.println(size);
    }

    public static void mapOptional2() {
        String name = "baeldung";
        Optional<String> nameOptional = Optional.of(name);

        int len = nameOptional.map(String::length).orElse(0);
        System.out.println(len);
    }

    public static void mapOptional3() {
        String password = " password ";
        Optional<String> passOpt = Optional.of(password);
        boolean correctPassword = passOpt.filter(pass -> pass.equals("password")).isPresent();
        System.out.println(correctPassword);
        correctPassword = passOpt.map(String::trim).filter(pass -> pass.equals("password")).isPresent();
        System.out.println(correctPassword);
    }

    public static void flatMapOptional() {
        Person person = new Person("john", 26);
        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
        Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
        String name1 = nameOptional.orElse("");
        System.out.println(name1);
        String name = personOptional.flatMap(Person::getName).orElse("");
        System.out.println(name);
    }

    public static Optional<String> getEmpty() {
        return Optional.empty();
    }

    public static Optional<String> getHello() {
        return Optional.of("hello");
    }

    public static Optional<String> getBye() {
        return Optional.of("bye");
    }

    public static Optional<String> createOptional(String input) {
        if (input == null || "".equals(input) || "empty".equals(input)) {
            return Optional.empty();
        }
        return Optional.of(input);
    }

    public static void givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturned() {
        Optional<String> found = Stream.of(getEmpty(), getHello(), getBye())
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        System.out.println(found.orElse("empty"));
    }

    public static void givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturnedAndRestNotEvaluated() {
        Optional<String> found = Stream
                .<Supplier<Optional<String>>>of(MyOptional::getEmpty, MyOptional::getHello, MyOptional::getBye)
                .map(Supplier::get)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        System.out.println(found.orElse("empty"));
    }
    
    public static void givenTwoOptionalsReturnedByOneArgMethod_whenChaining_thenFirstNonEmptyIsReturned() {
        Optional<String> found = Stream
                .<Supplier<Optional<String>>>of(() -> createOptional("empty"), () -> createOptional("hello"))
                .map(Supplier::get)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        System.out.println(found.orElse("empty"));
    }
    
    public void givenTwoEmptyOptionals_whenChaining_thenDefaultIsReturned() {
        String found = Stream
                .<Supplier<Optional<String>>>of(() -> createOptional("empty"), () -> createOptional("empty"))
                .map(Supplier::get)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .orElseGet(() -> "default");
        System.out.println(found);
    }
    
}
