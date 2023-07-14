package sec1;

public class Qna extends Board {
    private int level;
    private int parno;

    public Qna() { super(); }

    public Qna( int no ) { super(1); }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }
}
