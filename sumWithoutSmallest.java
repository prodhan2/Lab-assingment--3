import java.util.Arrays;
import java.util.Scanner;

public class sumWithoutSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elenment");
        int n = input.nextInt();
        int [] array = new int[n];

        System.out.println("Enter your Elements");
        for(int i=0;i<n;i++)
        {
            array[i] = input.nextInt();
        }
          Arrays.sort(array);

        int sum=0;
        for(int m :array)
        {
            sum =sum+m;
        }
        System.out.println("sum all elements= "+sum);
           int wsum =0;
        for(int i=1;i<n;i++)
        {
            wsum = wsum+array[i];
        }
        System.out.println("sum Without Smallest= "+wsum);
        System.out.println("Difference = " +(sum - wsum));
    }
}
