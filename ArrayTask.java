import java.util.Random;
import java.util.Scanner;
public class ArrayTask {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Array Size: ");
        int arraySize = in.nextInt();

        int[] arr = new int[arraySize];
        
        for(int i = 0 ; i < arraySize ; i++)
        {
            int number = rand.nextInt(101);
            arr[i] = number;
        }
        int choice = 0;
        do{
            System.out.println("Operators: ");
            System.out.println("1- Minimum element of the array");
            System.out.println("2- Maximum element of the array");
            System.out.println("3- Average elemet of the array");
            System.out.println("4- Difference between each element with average");
            System.out.println("5- The sum of odd indexes");
            System.out.println("6- The sum of even indexes");
            System.out.println("7- Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();
            if(choice == 1 )
            {
                System.out.println(minimumIntArray(arr));
            }
            else if(choice == 2 )
            {
                System.out.println(maximumIntArray(arr));
            }
            else if( choice == 3)
            {
                System.out.println(average(arr));
            }
            else if( choice == 4)
            {
                String output =" ";
                for (int i = 0 ;i < arr.length ; i++ )
                {
                    output += (differenceArray(arr)[i]+", ");
                }
                System.out.println(output);
            }
            else if(choice == 5 )
            {
                System.out.println(sumOdd(arr));
            }
            else if(choice == 6)
            {
                System.out.println(sumEven(arr));
            }
            
        }
        while(choice != 7);
    }
    public static int[] differenceArray (int[] inputArray) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        average = sum / inputArray.length;
        int[] newArray = new int[inputArray.length];
        for ( int i =0 ; i < newArray.length ; i++) {
            newArray[i] = inputArray[i]-average;
        }
        return newArray;
    }
    public static int average ( int[] array) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;

    }
    public static int sumEven(int[] a){ 
        int even = 0;
        for(int i = 0; i < a.length; i++){
            if(i % 2 == 0){
                even += a[i];
            }
        }
        return even;
    }

    public static int sumOdd(int[] a){
        int odd = 0;
        for(int i = 0; i < a.length; i++){
            if(i % 2 != 0){
                odd += a[i];
            }
        }
        return odd;
    }
    public static int maximumIntArray(int[] array){
        int maximum = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }
    
    public static int minimumIntArray(int[] array){
        int minimum = 100;

        for(int i=0;i<array.length;i++){
            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        return minimum;
        //comment block
    }
}
