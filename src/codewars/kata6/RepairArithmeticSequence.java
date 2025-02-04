package codewars.kata6;

import java.util.Arrays;

public class RepairArithmeticSequence {

    public static void main(String[] args) {

        int [] fArray = {2, 4, 6, 8, 15, 12};
        int [] sArray = {2, 4, 7, 8, 10};
        int [] tArray = {2, 4, 6, 8, 11};
        System.out.println(Arrays.toString(repairSequence(fArray)));
        System.out.println(Arrays.toString(repairSequence(sArray)));
        System.out.println(Arrays.toString(repairSequence(tArray)));


    }

    public static int[] repairSequence(int[] sequence) {
        if (sequence.length <= 3) {
            return sequence;
        }

        int[] repairedSequence = new int[sequence.length];

        int difference;

        if(sequence[1] - sequence[0] == sequence[2] - sequence[1]){
            difference = sequence[1] - sequence[0];
            repairedSequence[0] = sequence[0];
        }else if(sequence[2] - sequence[1] == sequence[3] - sequence[2]){
            difference = sequence[2] - sequence[1];
            repairedSequence[0] = sequence[1] - difference;
        }else{
            difference = sequence[3] - sequence[2];

            if (difference != sequence[2] - sequence[0] - difference) {
                difference = sequence[1] - sequence[0];
            }

            repairedSequence[0] = sequence[0];
        }

        for(int i = 1; i < repairedSequence.length; i++){
            repairedSequence[i] = repairedSequence[i - 1] + difference;
        }

        return repairedSequence;
    }

}
