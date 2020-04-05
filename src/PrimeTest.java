import java.util.*;
public class PrimeTest
{
    public static void main(String[] args)
    {
        Tester pTest = new Tester();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter any integer greater than 1: ");
            double input = scanner.nextDouble();
            if (pTest.isPrime(input))
            {
                System.out.println((int)input + " is prime.");
            }
            else
            {
                System.out.println(input + " is not prime.");
            }
        }
    }
}
