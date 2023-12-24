import model.Ladder;
import model.Player;
import model.Snake;


public class Controller {

    Service service;

    public Controller() {
        this.service = new Service();
    }

    public Snake saveSnake(int head, int tail) {
        return service.savesnake(head,tail);

    }

    public Ladder saveLadder(int ladderHead, int ladderTail) {
        return service.saveLadder(ladderHead, ladderTail);
    }

    public Player createPlayer(String name) {
       return service.createPlayer(name);

    }
    public void setNoOfPlayer(int number)
    {
         service.setNoOfPlayer(number);
    }
    public void play(){
        service.play();
    }
}
