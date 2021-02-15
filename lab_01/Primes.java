class Primes
{
    // программа выводит все простые числа до указанного предела
    public static void main(String[] args)
    {
        int limit = 100;
        checkPrimes(limit);
    }

    // метод находит все простые числа до указаного предела
    public static int checkPrimes(int limit)
    {
        for (int i = 2; i <= limit; ++i)
        {
            if (isPrime(i))
            {
                System.out.println("Prime number " + i);
            }
        }

        return 0;
    }

    // метод возвращает true если число простое, false если число не является простым
    public static boolean isPrime(int n)
    {
        int divider = 2;
        while (divider * divider <= n)
        {
            if (n % divider == 0)
            {
                return false;
            }
            ++divider;       
        }
        return true;
    }
}