package BreakContinue;

public class BreakContinue {

    public static void main(String[] args) {
        // breakExample();

        // breakExample2();

        unlabeledBreak();

        labeledBreak();

        // continueExample();
    }

    public static void breakExample() {
        for (int i = 0; i < 100; i++) {
            if (i * 10 == 50)
                break; // terminate loop if i is 5
            System.out.println("i: " + i);
        }
        System.out.println("Loop completed.");
    }

    public static void breakExample2() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Iteration " + i + ": ");
            for (int j = 0; j < 10; j++) {
                if (j == 5)
                    break; // terminate loop if j is 5
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops completed.");
    }

    public static void unlabeledBreak() {
        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }

    public static void labeledBreak() {
        int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search: for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }

    public static void continueExample() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

}
