// lab2.java
// Anna Wahl
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods

// The max prime I could find using this was 9999991. It took awhile for it to load.

// It finishes insanely faster when I don't print the numbers.

// Mostly time limits finding larger numbers. I input 100000000, but it took too long. If I were only to output the last number, I would be able to do more.

public class lab2 {
    
    public static void main(String[] args) {

        int N = 0;

        // Check if arguments are provided
        if (args.length == 0) {
            N = 1000;
        } else {
            N = Integer.parseInt(args[0]);
        }

        // setup array of booleans
        boolean[] lights = new boolean[N + 1];

        // set lights[0] and lights[1] to false
        lights[0] = false;
        lights[1] = false;

        // set lights[2] to lights[N] to false
        for (int i = 2; i <= N; i++) {
            lights[i] = true;
        }

        // mark off values
        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i * i; j <= N; j += i) {
                lights[j] = false;
            }
        }

        // display results
        for (int i = 2; i <= N; i++) {
            if (lights[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}

