package com.green.javaHome.sty.method;



public class CarConstructor2 {
    public static void main(String[] args) {
        Car10 c1 = new Car10();
        Car10 c2 = new Car10("blue");

        System.out.println("c1 의 color = "+ c1.color+", gearType = "+ c1.geartype+", door = "+ c1.door);
        System.out.println("c2 의 color = "+ c2.color+", gearType = "+ c2.geartype+", door = "+ c2.door);


        System.out.println("=======================================================");

        Car10 c9 = new Car10();
        Car10 c10  = new Car10(c9);

        System.out.println("c9 의 color = "+ c9.color+", gearType = "+ c9.geartype+", door = "+ c9.door);
        System.out.println("c10 의 color = "+ c10.color+", gearType = "+ c10.geartype+", door = "+ c10.door);

        c9.door = 100;
        System.out.println("c9.door = 100; 수행후");
        System.out.println("c9 의 color = "+ c9.color+", gearType = "+ c9.geartype+", door = "+ c9.door);
        System.out.println("c10 의 color = "+ c10.color+", gearType = "+ c10.geartype+", door = "+ c10.door);


    }
}
// this() <<< 생성자에서 다른 생성자 호출할 때 사용
// 다른 생성자 호출시 첫 줄에서만 사용가능
// this <<<< 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있다.
//모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
// 생성자와 인스턴스 메서드 에서만 this 사용 가능하며 static 메서드는 사용 불가.


class Car10{
    String color;
    String geartype;
    int door;

    Car10(){
        this("white", "auto", 4);

    }

    Car10(String color){
        this(color,"auto",4);
    }

    Car10(Car10 c){

        color = c.color;
        geartype = c.geartype;
        door = c.door;

    }
    Car10(String color, String gearType, int door){
        this.color =  color;
        this.geartype = gearType;
        this.door = door;
    }



}
