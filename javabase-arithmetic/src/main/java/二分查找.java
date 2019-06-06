public class 二分查找 {
    public static int biSearch(int[] arr,int n){
        int left =0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right) / 2;//中间位置的计算方式
            if(arr[mid]==n){
                return mid;
            }else if(arr[mid]>n){//因为是从小打到排序的，如果中间的都大，那么右边的肯定都大
                right = mid -1;//右指针移动
            }else{//因为是从小打到排序的，如果中间的都小，那么右边的肯定都小
                left = mid + 1;//左指针移动
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,14,20};//已经从小到达排序
        int pos = biSearch(arr, 8);
        System.out.println(pos);
    }
}
