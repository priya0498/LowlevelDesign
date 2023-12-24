package model;

public class Ladder {
    int ladderHead;
    int ladderTail;

    public int getLadderHead() {
        return ladderHead;
    }

    public int getLadderTail() {
        return ladderTail;
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "ladderHead=" + ladderHead +
                ", ladderTail=" + ladderTail +
                '}';
    }

    public Ladder(int ladderHead, int ladderTail) {
        this.ladderHead = ladderHead;
        this.ladderTail = ladderTail;
    }
}
