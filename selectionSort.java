public class selectionSort {

    static void selectionSort(int[] arr){
        int n =  arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,3,1,8,6,2,5,4};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }    
        System.out.println();
    }
}

// => Big O là O(N mũ 2)
//Vì có 2 vòng lặp