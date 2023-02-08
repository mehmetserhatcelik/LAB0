public class ArrayTask {
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





}