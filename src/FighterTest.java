abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춤니다.");
    }
}

interface Fightable {
    void move(int x, int y);

    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
    //오버라이딩 규칙 : 조상(puvlic)보다 접근제어자가 범위가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "]로 이동");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }

    Fightable getFightable(){
        Fightable f = new Fighter();
        return f;
    }
//    @Override
//    public String toString() {
//        return "전투기";
//    }

}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
       Fightable f2 = f.getFightable();
    }
}
