import java.util.*;
public class Dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N = sc.nextInt();
        System.out.println("The Next Prime Number is: ");
        System.out.print(primeNumber(N));
    }

    private static int primeNumber(int n) {
        n++;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                n++;
                i=2;
            }
            else
            {
                continue;
            }
        }
        return n;
    }
}
/*
Input:
Enter the Number: 
11
Output:
The Next Prime Number is: 
13*/
