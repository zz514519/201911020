import java.util.Arrays;
public class Test11 {
    public static void main(String[] args) {
           int[] arr = {1,2,3,4,5,6};
           int max = project(arr);
           System.out.println(max);
          int min = project1(arr);
          System.out.println(min);
          int sum = project2(arr);
          System.out.println((double)(sum/arr.length));
          int[] ret = project3(arr);
          for(int i=0;i<arr.length;++i){
              System.out.print(ret[i]+" ");
          }
    }
    public static int project(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;++i){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int project1(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;++i){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int project2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] project3(int[] arr) {
        int[] ret =Arrays.copyOf (arr,arr.length);
        for(int i=0;i<arr.length-1;++i){
            int tmp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }
        return ret;
    }
}
