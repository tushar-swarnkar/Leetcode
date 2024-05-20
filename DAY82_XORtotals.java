public class DAY82_XORtotals {

    // LEETCODE : 1863

    public static void main(String[] args) {
        
    }

    static int sum=0;
    static int subsetXORSum(int[] nums) {
        sum=0;
        return getAns(nums,0,0);
    }
    
    static int getAns(int[] arr,int i,int cur){
        if(i==arr.length){
            return cur;
        }
        return getAns(arr,i+1,cur^arr[i]) + getAns(arr,i+1,cur);
    }
}
