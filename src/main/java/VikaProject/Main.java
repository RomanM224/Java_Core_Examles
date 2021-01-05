package VikaProject;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Month: ");
        int month = scanner.nextInt();
        System.out.print("Enter Day: ");
        int day = scanner.nextInt();
        boolean check = true;

        if (year % 4 == 0) {
            if (month % 2 != 0 && day >= 1 && day <= 31) {
            } else if (month % 2 == 0 && month != 2 && day >= 1 && day <= 30) {
            } else if (month == 2 && day >= 1 && day <= 29) {
            } else {
                System.out.println("Wrong date");
                check = false;
            }

        } else {
            if (month % 2 != 0 && day >= 1 && day <= 31) {
            } else if (month % 2 == 0 && month != 2 && day >= 1 && day <= 30) {
            } else if (month == 2 && day >= 1 && day <= 28) {
            } else {
                System.out.println("Wrong date");
                check = false;
            }
        }
        
 
    //    System.out.printf("%d:%d:%d", day, month, year);
        if(year < 2001) {
            while(year < 2001) {
                year = year + 12;
            }
        }else if(year > 2012) {
            while(year > 2012) {
                year = year - 12;
            } 
        }
        System.out.println(getYearAnimalName(year));
    }

    public static String getYearAnimalName(Integer year) {
        String yearAnimalName = "";
        if (year == 2001) {
            yearAnimalName = "Snake";
        } else if (year == 2002) {
            yearAnimalName = "Horse";
        }else if (year == 2003) {
            yearAnimalName = "Sheep";
        } else if (year == 2004) {
            yearAnimalName = "Monkey";
        } else if (year == 2005) {
            yearAnimalName = "Cock";
        } else if (year == 2006) {
            yearAnimalName = "Dog";
        } else if (year == 2007) {
            yearAnimalName = "Pig";
        } else if (year == 2008) {
            yearAnimalName = "Rat";
        } else if (year == 2009) {
            yearAnimalName = "Bull";
        } else if (year == 2010) {
            yearAnimalName = "Tiger";
        } else if (year == 2011) {
            yearAnimalName = "Rabbit";
        } else if (year == 2012) {
            yearAnimalName = "Dragon";
        }
        return yearAnimalName;

    }

}
