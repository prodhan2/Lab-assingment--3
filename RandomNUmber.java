public class Main {
    public static void main(String[] args) {
       int array[] = {12,4,23,55,66,77,64,24,122,43};
        System.out.println("Every element at an even index");
       for(int i =0;i< array.length;i=i+2)
       {

           System.out.print(array[i]);
           System.out.print(" ");
       }

        System.out.println();

        System.out.println(" Every even element.");
       for(int m : array)
       { if(m%2==0)
           System.out.print(m);
           System.out.print(" ");
       }
        System.out.println();

        System.out.println("All elements in reverse order.");
       for(int j = array.length-1;j>0;j--)
       {
           System.out.print(array[j]);
           System.out.print(" ");
       }

        System.out.println();
        System.out.println("Array First Element="+array[0]);
        System.out.println("Array Last Element ="+array[array.length-1]);
    }
}