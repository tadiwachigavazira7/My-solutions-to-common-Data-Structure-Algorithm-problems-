// This is the algorithm that prints out the first 20 numbers of the fibonacci sequence.

public class FibonacciSequence {

    // The creating the method that will return the first 20 numbers from the fibonacci sequence.
    public static  int fibonacciSequenceMethod () {

        // Initializing and printing the first two numbers of the fibonacci sequence.
        int var1 = 0;
        int var2 = 1;
        int nextFib = 0;
        System.out.println(var1);
        System.out.println(var2);

        /* This is the sequence that we need to repeat:
        nextFib = var1 + var2
        print(nextFib)
        var1 = var2
        var2 = nextFib
        */

        // The iteration:
            for (int i = 0; i <= 17; i++) {
                nextFib = var1 + var2;
                System.out.println(nextFib);
                var1 = var2;
                var2 = nextFib;
            }
            return 0;
        } 
    
    public static void main(String[] args) {

      fibonacciSequenceMethod();  
    }     
}


