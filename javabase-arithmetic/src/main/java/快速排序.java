public class 快速排序 {

    public static void quciksort(int[] s, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int x = s[l];
            while (i < j) {//i,j相遇，就到了基准数的坑
                while (i < j && s[j] >= x)//右边不小于
                    j--;
                while (i < j && s[i] <=x)//左边不大于
                    i++;
                if(i<=j){
                    int  t =  s[i];
                    s[i] = s[j];
                    s[j] = t;
                }
            }
            int t = s[l];
            s[l] = s[j];
            s[j] = t;
            quciksort(s, l, i - 1);//基准数前半截
            quciksort(s, i + 1, r);//基准书后半截
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1,3,4, 5, 6, 7, 8, 1};
        quciksort(arr, 0, arr.length - 1);
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
