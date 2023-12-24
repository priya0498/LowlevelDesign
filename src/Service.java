import model.Ladder;
import model.Player;
import model.Snake;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Service {

    Storage storage;

    public  Service() {
        this.storage = new Storage();
    }
    public Snake savesnake(int head, int tail) {
        Snake snake = new Snake(head, tail);
        return storage.insertSnake(snake);

    }

    public Ladder saveLadder(int ladderHead, int ladderTail) {
        Ladder ladder = new Ladder(ladderHead, ladderTail);
        return storage.insertLadder(ladder);
    }

    public Player createPlayer(String name) {
        String id = UUID.randomUUID().toString();
        Player player = new Player(name, id);
        return storage.insertplayer(player);

    }

    public boolean check(List<Player>templist ){
        for(Player p : templist)
        {
            if(p.getPosition() == 100)
            {
                return false;
            }
        }
        return  true;
    }

    public int setNoOfPlayer(int number) {
        return storage.setNoOfPlayer(number);
    }

    public void play() {
        int numberOfPlayer = storage.getNumberOfPlayer();
        int turn = 0;
        int dice = 0;
        Random random = new Random();
        List<Snake>snakeList = storage.getsnakeList();
        List<Ladder>ladderList = storage.getladderList();
        List<Player>playerList = storage.playerList();

        while (check(playerList))
        {
            System.out.println(playerList.get(turn).getName() + " turn");
            dice = random.nextInt(6) + 1;
            int position = playerList.get(turn).getPosition();
            System.out.println(position+" position before rolling the dice");
            if(position+dice <= 100) {
                position += dice;
            }

            System.out.println(position + " Position after rolling the dice");
            for(Ladder l : ladderList)
            {
                if(l.getLadderTail() == position)
                {
                    position = l.getLadderHead();
                    System.out.println(position + " Position after snake bite");
                }
            }
            for (Snake s : snakeList)
            {
                if (s.getHead() == position)
                {
                    position = s.getTail();
                    System.out.println(position + " Position after ladder climb");
                }
            }
            playerList.get(turn).setPosition(position);
           turn =(turn + 1)%numberOfPlayer;
        }
        for (Player p : playerList)
        {
            if(p.getPosition() == 100)
            {
                String name = p.getName();
                System.out.println(name+" has won the game");
                return;
            }

        }

    }


}
