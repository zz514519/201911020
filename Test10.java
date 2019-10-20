import java.util.Arrays;
public class Test10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] arr = transform(array);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
    }
    public static int[] transform(int[] array){
        int[] ret = Arrays.copyOf(array,array.length);
        for(int i=0;i<array.length;++i){
            ret[i] = ret[i] * 2;
        }
        return ret;
    }
}
