package pl.szczesniak.dominik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }


    public static void main (String[] args) {
    }

}
