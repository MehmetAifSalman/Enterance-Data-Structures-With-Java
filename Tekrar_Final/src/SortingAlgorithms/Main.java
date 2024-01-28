package SortingAlgorithms;

import java.util.Arrays;

public class Main {
   static int[] dizi = {69,54,78,63,24,15};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Algoritjms.BubleSort(dizi)));
        System.out.println(Arrays.toString(Algoritjms.InsertSort(dizi)));
        System.out.println(Arrays.toString(Algoritjms.SelectionSort(dizi)));
    }
}
