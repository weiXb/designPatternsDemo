package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by xianbin on 2017/6/23.
 */
public class Popsort {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 4, 1, 2, 4, 5};
        Integer tem;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    tem = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Map<Integer, Integer> map = Arrays.asList(arr)
                .stream()
                .collect(Collectors.groupingBy(Integer::new, Collectors.summingInt(value -> 1)));
        System.out.println(map);

        System.out.println(new HashSet<>(Arrays.asList(arr)));

    }
}
