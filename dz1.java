package Lesson_1;

import java.util.Arrays;
import java.util.List;

public class dz1 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2);
        listSwap1stAndLast(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("hello", "Java!");
        listSwap1stAndLast(list2);
        System.out.println(list2);


        Integer[] test = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(test);
        System.out.println(list);


    }

    public static <T> List<T> listSwap1stAndLast(List<T> list) {
        List<T> tempList = list;
        T firstElement = tempList.get(0);
        T lastElement = tempList.get(list.size() - 1);
        tempList.set(0, lastElement);
        tempList.set(tempList.size() - 1, firstElement);
        return tempList;
    }


}
