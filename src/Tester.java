public class Tester
{
    public boolean isPrime(double input)
    {
        if (input != (int)input)
        {
            return false;
        }
        if (input < 2)
        {
            return false;
        }
        for (int n = 2; n < input; n++)
        {
            double quotient = (double)input / (double)n;
            if (quotient == (int)quotient)
            {
                return false;
            }
        }
        return true;
    }
}
