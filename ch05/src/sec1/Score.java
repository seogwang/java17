package sec1;

public class Score {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Score() {  }

    public Score(int num) {
        this.num = num;
    }

    public Score(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Score(int num, String name, int kor) {
        this.num = num;
        this.name = name;
        this.kor = kor;
    }

    public Score(int num, String name, int kor, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public Score(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void prtNum(int num) {
        System.out.println("학번 : "+num);
    }

    public void prtName(int name) {
        System.out.println("이름 : "+name);
    }
}
