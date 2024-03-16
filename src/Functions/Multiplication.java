package Functions;

public class Multiplication {
    public static void printTable(int number, int multiplier)
    {
        if(multiplier <=10)
        {
            System.out.println(number+"*"+ multiplier+"="+(number*multiplier));
            printTable(number, multiplier+1);

        }
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Multiplication table for "+i+":");
            printTable(i,1);
            System.out.println();
        }
    }
}