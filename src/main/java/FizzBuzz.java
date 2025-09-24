public class FizzBuzz {
    /**
     * Print the FizzBuzz sequence for 1..100 to standard output.
     * Rules:
     * - Multiples of 3 -> "Fizz"
     * - Multiples of 5 -> "Buzz"
     * - Multiples of both 3 and 5 -> "FizzBuzz"
     * - Otherwise -> the number itself
     * Output should be 100 whitespace-separated tokens (spaces or newlines are fine).
     */
    public static void main(String[] args) {
        for(int i=0; i<100; i++)
            {
                if(i%3=0)
                {
                    System.out.println("Fizz");
                }
                elif(i%5=0)
                {
                    System.out.println("Buzz");
                }
                elif(i%3=0 + i%5=0)
                {
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println(i);
                }
                
                
            }
    }
}
