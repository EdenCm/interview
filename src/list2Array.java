import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list2Array {

    public static void main(String[] args) {
        Integer [] array = new Integer[5];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            array[i] = i;
            list.add(i+4);
        }

        //  list转数组
        Object[] list2array = list.toArray();
        // 数组转list
        List<Integer> array2list = new ArrayList<Integer>(Arrays.asList(array));
        array2list.add(7);
//        List<Integer> array2list = new ArrayList<Integer>(array.length) ;
//        Collections.addAll(array2list,array);


        System.out.println(array2list);
        System.out.println(list);
        System.out.println(Arrays.toString(list2array));
    }

//    public static int[] testReturn(){
//        Integer[] ing = new Integer[6];
//        int [] new_in =Collections.;
//        return ing;
//    }
}
