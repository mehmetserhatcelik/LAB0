public class ArrayTask{

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
    }

}