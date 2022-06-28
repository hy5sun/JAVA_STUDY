class Parent {
    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }
}

class Child extends Parent {
    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }
}

public class tcpschoolex1
 {
    public static void main(String[] args){
        Parent pa = new Parent();
        pa.display(); //부모 클래스의 display() 메소드입니다.
        Child ch = new Child();
        ch.display(); //자식 클래스의 display() 메소드입니다.
        Parent pc = new Child();
        pc.display(); //자식 클래스의 display() 메소드입니다.
        /*Child cp = new Parent(); 는 오류.
        참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 많기 때문 */
    }
}