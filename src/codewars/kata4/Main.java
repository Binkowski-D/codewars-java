package codewars.kata4;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.incProgress(-7);
        System.out.println("Rank: " + user.rank + ", Progress: " + user.progress);
        // Expected Rank: -8, Expected Progress: 10

        user.incProgress(-5);
        System.out.println("Rank: " + user.rank + ", Progress: " + user.progress);
        // Expected Rank: -7, Expected Progress: 0

        user.incProgress(1);
        System.out.println("Rank: " + user.rank + ", Progress: " + user.progress);
        // Expected Rank: -3, Expected Progress: 90

        user.incProgress(8);
        System.out.println("Rank: " + user.rank + ", Progress: " + user.progress);
        // Expected Rank: 8, Expected Progress: 0

        user.incProgress(-8);
        System.out.println("Rank: " + user.rank + ", Progress: " + user.progress);
        // Expected Rank: 8, Expected Progress: 0 (no further progress)
    }
}

class User {
    public int rank = -8;
    public int progress = 0;

    public void incProgress(int taskRank){
        if(taskRank < -8 || taskRank > 8 || taskRank == 0 ){
            throw new IllegalArgumentException("The task rank must be between -8 and 8 (excluding zero).");
        }

        if(rank == 8){
            return;
        }

        int d = calculateDifference(rank, taskRank);


        if(d >= 2){
            return;
        }else if(d == 1){
            progress += 1;
        }else if(d == 0){
            progress += 3;
        }else{
            progress += 10 * d * d;
        }

        while(progress >= 100 && rank < 8){
            progress -= 100;
            rank ++;

            if(rank == 0){
                rank ++;
            }

            if(rank == 8){
                progress = 0;
            }
        }
    }

    private int calculateDifference (int userRank, int taskRank){
        return getRankIndex(userRank) - getRankIndex(taskRank);
    }

    private int getRankIndex (int rank){
        return rank > 0 ? rank  : rank + 1;
    }
}
