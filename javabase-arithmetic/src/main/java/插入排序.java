public class 插入排序 {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j>0 && array[j]<array[j-1]; j--) {
                int t = array[j];
                array[j] = array[j-1];
                array[j-1] =  t;
            }
        }
    }
    public static void insertionSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {//i=1 是默认第一个元素已经排好序，i之前都是已经排序的
            int key = array[i];//拿到要插入的元素
            int j = i;//
            while (j>=0 &&  array[j] > key){//如果插入的元素比最后的那个小，就把元素往后挪，腾出位置来插入）
                array[j]=array[j-1];//当前元素向后移动
                j--;
            }
            array[j] =key;// 插入
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        for(int n :arr){
            System.out.println(n);
        }
    }
}
