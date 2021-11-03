package lesson15.team.task9;

import java.util.Random;
import java.util.stream.Stream;

public class Task9 {
    public void getTask9(){


    }

//    public int takeCountNumber(int n){
////        int result = 0;
////        System.out.println("Enter number 'n' ?: ");
////
////        for (int i = 0; i < n; i++) {
////            if (takeTrueOrFalse() != 1 ){
////                result++;
////            }
////        }
////        return result;
//    }

    public Stream<Integer> takeTrueOrFalse(){
        Random random = new Random();
        return random.ints(0,1).boxed();
    }
}
