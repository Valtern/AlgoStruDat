import java.util.Scanner;

public class uniselection {
    public static String countVotes(String[] votes, int start, int end) {
        if (start == end) {
            return votes[start];
        } else {
            int mid = start + (end - start) / 2;
            String leftCandidates = countVotes(votes, start, mid);
            String rightCandidates = countVotes(votes, mid + 1, end);

            if (leftCandidates.equals(rightCandidates)) {
                return leftCandidates;
            } else {
                int leftCount = countVotesHelper(votes, leftCandidates, start, end);
                int rightCount = countVotesHelper(votes, rightCandidates, start, end);
                if (leftCount > rightCount) {
                    return leftCandidates;
                } else if (rightCount > leftCount) {
                    return rightCandidates;
                } else {
                    return "m";
                }

            }
        }
    }

    public static int countVotesHelper(String[] votes, String candidate, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (votes[i].equalsIgnoreCase(candidate)) {
                count++;
            }
        }

        return count;
    }
}
