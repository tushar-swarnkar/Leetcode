import java.util.Arrays;

public class DAY106_noOfMoves {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int moves = 0;

        for (int i = 0; i < seats.length; i++) {
            int diff = students[i] - seats[i];
            if (diff < 0) {
                diff *= -1;
                moves += diff;
            } else {
                moves += diff;
            }
        }

        return moves;
    }
}
