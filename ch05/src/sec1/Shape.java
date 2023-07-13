package sec1;

public class Shape {
    //접근제한자 : public > default(생략) > private
    //public : 어떤 패키지에서 접근할 수 있음.
    //default : 같은 패키지에 있는 클래스에서만 접근할 수 있음.
    //private : 현재 클래스 내부에서만 접근할 수 있음. (우리는 주로 이것을 사용함)
    //멤버 필드
    private String type;
    private int length;
    private double area;

    //생성자(construntor)
    public Shape(){}
    public Shape(String type){
        this.type = type;
    }
    public Shape(String type, int length){
        this.type = type;
        this.length = length;
    }

    //멤버 메소드(Member Method)
    public double calcArea(){
        if(this.type.equals("square")) {
            this.area = this.length * this.length;
        } else if(this.type.equals("triangle")) {
            this.area = this.length * 10 / 2;
        } else if(this.type.equals("circle")) {
            this.area = this.length * this.length * 3.14159;
        } else {
            this.area = 0.0f;
        }
        return this.area;
    }

    // set메소드(저장 메소드) : 각 필드에 값을 저장할 목적
    public void setType(String type){
        this.type = type;
    }
    public void setLength(int length){
        this.length = length;
    }
}
