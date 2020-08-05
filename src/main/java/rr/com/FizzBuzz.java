package rr.com;

public class FizzBuzz {

    public static String fizzBuzz(int n) {
        argumentChecker(n);
        return getAnswerFor(n);
    }

    private static String getAnswerFor(int n) {
        if (returnFizzBuzz( n)) return "fizzBuzz";
        if (returnBuzz(n)) return "Buzz";
        if (returnFizz(n)) return "Fizz";
        return String.valueOf(n);
    }


    private static void argumentChecker(int n) {
        if(n < 1) throw new IllegalArgumentException("Not a valid number");
    }

    private static boolean returnFizz(int n) {
        return n % 5 == 0;
    }

    private static boolean returnFizzBuzz(int n) {
        return returnBuzz(n) && returnFizz(n);
    }

    private static boolean returnBuzz(int n) {
        return n % 3 == 0;
    }


}
