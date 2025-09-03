public class mysteryAlgorithm {
    
    public static void main(String[] args) {

        int reversed = 0;
        int digit = 0;
        int num = inputNumber(); // Assume this function gets a number from the user

        while (num > 0) {
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

}
