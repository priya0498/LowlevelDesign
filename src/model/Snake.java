package model;

public class Snake {
    int head;
    int tail;

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;

    }
}
