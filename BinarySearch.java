public class BinarySearch {
    // Sıralı dizide logaritmik zaman karmaşıklığı ile arama yapan fonksiyon
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // Eleman tam ortadaysa direkt döndür
            if (arr[mid] == x)
                return mid;

            // Eleman ortadaki değerden küçükse sol alt diziyi ara
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Eleman ortadaki değerden büyükse sağ alt diziyi ara
            return binarySearch(arr, mid + 1, r, x);
        }

        // Eleman dizide bulunamadıysa -1 döndür
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10; // Aranacak sayı
        int result = ob.binarySearch(arr, 0, n - 1, x);
        
        if (result == -1)
            System.out.println("Eleman dizide bulunamadi.");
        else
            System.out.println("Eleman dizinin " + result + ". indeksinde bulundu.");
    }
}
