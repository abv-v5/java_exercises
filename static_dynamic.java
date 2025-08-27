// import java.lang.reflect.Array;
import java.util.Arrays;

public class static_dynamic {
    public static void main(String[] args){
        int[] d_array = new int[5];
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        d_array[0] = 10;
        d_array[1] = 20;
        d_array[2] = 30;
        d_array[3] = 40;
        d_array[4] = 50;
        System.out.println(Arrays.toString(d_array));
    }
}
