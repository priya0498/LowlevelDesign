package model;
public class Player {

    String name;
    int position;
    String id;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getId() {
        return id;
    }

    public Player(String name, String id) {
        this.name = name;
        this.position = 0;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", id='" + id + '\'' +
                '}';
    }
}
