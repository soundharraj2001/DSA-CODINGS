import java.util.Arrays;
public class CyclicSortForGivenArray {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr) {
        int i = 0;
       while (i<arr.length){
           //assign variable(correct) that index is -1 for that value
            int correct = arr[i]- 1;
            //check whether the value is placed on correct index or not
            if (arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
