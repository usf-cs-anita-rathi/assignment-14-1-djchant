package Chapter14Section1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JumpIt {

    public static void main(String[] args){
        int num;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter game board size: ");
        num = input.nextInt();
        ArrayList<Integer> board = new ArrayList<>();
        board.add(0);

        for(int i = 1; i < num; i++) {
            board.add(rand.nextInt(100));
        }

        for(int i = 0; i < num; i++) {
            System.out.print(board.get(i) + " ");
        }

        System.out.println("Lowest cost = " + jump(board, 0));
    }

    public static int jump(ArrayList<Integer> board, int start) { //start = 0
        if(start >= board.size() - 2){
            return 0;
        }else{
            if(board.get(start + 1) < board.get(start + 2)) {
                return(board.get(start + 1) + jump(board, start+1));
            }else{
                return(board.get(start + 2) + jump(board, start + 2));
            }
        }
    }
}
