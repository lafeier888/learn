public class Main {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int j = i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,6,8};
        sort(arr);
        for(int n:arr){
            System.out.println(n);
        }




    }
}
