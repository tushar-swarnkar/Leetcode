import java.util.Arrays;

public class DAY65_boatsToSavePeople {

    // LEETCODE : 881

    public static void main(String[] args) {
        int[] peep = {1,2};
        int limit = 3;

        System.out.println(numRescueBoats(peep, limit));
    }
    static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                boatCount++;
                left++;
                right--;
            }
            else{
                boatCount++;
                right--;
            }
        }
        return boatCount;
    }
}
