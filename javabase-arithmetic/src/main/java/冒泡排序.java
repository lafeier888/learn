public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubblesort2(arr);
        for (int n : arr) {
            System.out.println(n);
        }
    }
    private static void bubblesort2(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) { //i
            for (int j = arr.length-1; j >i ; j--) {
                if(arr[j]>arr[j-1]){
                    int t = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = t;
                }
            }
        }
    }

    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//最后一个元素不用比了
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //每轮的最后一个元素不用比较
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
