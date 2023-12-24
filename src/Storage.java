import model.Ladder;
import model.Player;
import model.Snake;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Snake> snakelist;
    int numberOfPlayer ;
    List<Ladder> ladderList;
    List<Player> playerList;
    public Storage(){
        this.snakelist = new ArrayList<>();
        this.ladderList = new ArrayList<>();
        this.playerList = new ArrayList<>();
    }



    public Snake insertSnake(Snake snake) {
        snakelist.add(snake);
        return snake;
    }

    public Ladder insertLadder(Ladder ladder) {
        ladderList.add(ladder);
        return ladder;
    }

    public Player insertplayer(Player player) {
        playerList.add(player);
        return player;
    }
    public  List<Snake> getsnakeList() {
        return snakelist;
    }

    public List<Ladder> getladderList() {
        return ladderList;
    }

    public List<Player> playerList() {
        return playerList;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public int setNoOfPlayer(int number) {
        this.numberOfPlayer = number;
        return numberOfPlayer;
    }
}
