import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int arr[] = {12, 3, 15, 27, 42, 11, 9};
        System.out.println(Bubblesort(arr));
    }

    public static String Bubblesort(int[] arr1) {
        for(int i = 0; i < arr1.length - 1; i++){
            for(int j = 0; j < arr1.length - i - 1; j++){
                if (arr1[j] > arr1[j + 1]){
                    int a = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = a;
                }
            }
        }
        return Arrays.toString(arr1);
    }
}
