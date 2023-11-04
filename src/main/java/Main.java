public class Main {
    public static void main(String[] args) {
        int numForFizz = 9;
        if (numForFizz % 3 == 0 && numForFizz % 5 != 0) {
            System.out.println("Fizz");
        } else if (numForFizz % 5 == 0 && numForFizz % 3 != 0) {
            System.out.println("Buzz");
        } else if (numForFizz % 3 == 0 && numForFizz % 5 == 0) {
            System.out.println("FizzBuzz");
        }
    }
}
