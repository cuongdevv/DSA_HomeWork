public class SortArray012 {
    
    public static void sort012(int[] arr) {
      int low = 0; // 2
      int mid = 0; // 5
      int high = arr.length - 1; // 4
      // 0,0,1,1,1,2,2,2,2
        while (mid <= high) { // 0 <= 8 | 1 <= 8 | 1 <= 7 | 2 <= 7 | 2 <= 6 | 2 <= 5 | 2 <= 4 | 3 <= 4 | 4 <= 4 | 5 <= 4 BREAK
            if (arr[mid] == 0) {
                int temp = arr[low]; // temp = 1 | temp = 1
                arr[low] = arr[mid]; // low = 0 | low = 0
                arr[mid] = temp; // mid = 1 | mid = 1
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid]; // temp = 2 | temp = 2 | temp = 2 | temp = 2
                arr[mid] = arr[high]; // mid = 1 | mid = 2 | mid = 2 | mid = 1
                arr[high] = temp; // high = 2 | high = 2 | high = 2 | high = 2
                high--; // index high = 7 | index high = 6 | index high = 5 | index high = 4
            }
        } // => mảng hiện tại 0,1,1,1,0,2,2,2,2
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 0, 0, 1, 2, 2, 1};
        // System.out.println(arr.length);
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
