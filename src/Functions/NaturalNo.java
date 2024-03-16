public class NaturalNo
{
    public static int sumOfNaturals(int n)
    {
        if (n == 1)
        {
            return 1;
    }
        else
        {
            return n + sumOfNaturals(n - 1);
        }
    }
        public static void main(String[] args) {
        int n = 5;
        int sum = sumOfNaturals(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum); }
}
