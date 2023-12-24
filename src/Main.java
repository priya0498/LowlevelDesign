import model.Ladder;
import model.Player;
import model.Snake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of player");
        int numberofplayer = Integer.parseInt(input.next());
        controller.setNoOfPlayer(numberofplayer);
       while(numberofplayer > 0) {
           System.out.println("Enter Player" + numberofplayer + "name");
           String name1 = input.next();
           Player p = controller.createPlayer(name1);
           System.out.println(p);
           numberofplayer--;
       }
        System.out.println("Enter number of Snakes");
        int snakeCount = input.nextInt();

        while(snakeCount > 0) {
            int snakeHead = input.nextInt();
            int snakeTail = input.nextInt();
            Snake s = controller.saveSnake(snakeHead,snakeTail);
            System.out.println(s);
            snakeCount--;

        }
        System.out.println("Enter number of Ladders");
        int  ladderCount = input.nextInt();
        while(ladderCount > 0) {
            int ladderHead = input.nextInt();
            int ladderTail = input.nextInt();
            Ladder l = controller.saveLadder(ladderHead, ladderTail);
            System.out.println(l);
            ladderCount--;

        }

        controller.play();

    }
}