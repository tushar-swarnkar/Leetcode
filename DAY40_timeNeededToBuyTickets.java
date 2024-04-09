public class DAY40_timeNeededToBuyTickets {

    // LEETCODE 2073

    public static void main(String[] args) {
        int[] t = {2,3,2};
        int k = 2;

        System.out.println(timeRequiredToBuy(t, k));
    }
    static int timeRequiredToBuy(int[] tickets, int k) {
        int t = 0;
        while (true) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i] = tickets[i] - 1;
                    t++;
                }
                if (i == k && tickets[i] == 0) {
                    return t;
                }
            }
        }
    }
}
