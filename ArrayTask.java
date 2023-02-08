public class ArrayTask {


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

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(sumEven(a));
    }
    
}
