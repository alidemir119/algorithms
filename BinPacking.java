import java.util.Arrays;

public class BinPacking {
    // Nesneleri First Fit mantığıyla kutulara yerleştiren algoritma
    static int firstFit(int weight[], int n, int c) {
        int res = 0; // Kullanılan kutu sayısı
        int bin_rem[] = new int[n]; // Kutuların kalan kapasitelerini tutan dizi

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < res; j++) {
                if (bin_rem[j] >= weight[i]) {
                    bin_rem[j] = bin_rem[j] - weight[i];
                    break;
                }
            }

            // Eğer nesne var olan hiçbir kutuya sığmadıysa yeni kutu aç
            if (j == res) {
                bin_rem[res] = c - weight[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int weight[] = { 2, 5, 4, 7, 1, 3, 8 };
        int c = 10; // Her bir kutunun maksimum kapasitesi
        int n = weight.length;
        System.out.println("Gerekli minimum kutu sayisi: " + firstFit(weight, n, c));
    }
}
