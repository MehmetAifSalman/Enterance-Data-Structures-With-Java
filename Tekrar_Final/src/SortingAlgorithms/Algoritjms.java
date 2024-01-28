package SortingAlgorithms;

public class Algoritjms {
    public static int[] BubleSort(int[] dizi)
    {
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - 1; j++) {
                if(dizi[j] > dizi[j+1]){
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
        return dizi;
    }
    public static int[] InsertSort(int[] dizi)
    {
        for (int i = 0; i < dizi.length-1; i++) {
            for (int j = i; 0 <= j; j--) {
                if(dizi[j] > dizi[j+1])
                {
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
        return dizi;
    }
    public static int[] SelectionSort(int[] dizi)
    {
        int n = dizi.length; // Dizinin boyutunda daha sonra değişme olacağı için orjinal boyutu değişken içinde saklıuryoruz
        for (int i = 0; i < n-1; i++) {
            int mininds = i;
            for (int j = i+1; j < n ; j++) {
                if(dizi[j] < dizi[mininds])
                    mininds = j;

            }
            int temp = dizi[mininds];
            dizi[mininds] = dizi[i];
            dizi[i] = temp;

        }
        return dizi;
    }
}
