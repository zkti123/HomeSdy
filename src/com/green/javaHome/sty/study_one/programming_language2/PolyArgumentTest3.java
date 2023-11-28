package com.green.javaHome.sty.study_one.programming_language2;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv2 tv = new Tv2();
        Computer2 com = new Computer2();
        Audio2 audio2 = new Audio2();

        b.buy(tv);
        b.buy(com);
        b.buy(audio2);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
class Product2 {
    int price;  //제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {

    }
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);

    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }


    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }


    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoiint = 0;

    Vector item = new Vector();

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
        }
        money -= p.price;
        bonusPoiint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    void refund(Product2 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoiint -= p.bonusPoint;
            System.out.println(p+"을/를 반품하셨습니다");
        }else {
            System.out.println("해당제품은 구입하신적이 없습니다.");

        }
    }

    void summary() {
        int sum = 0;
        String itemList = " ";
        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
        }
        for (int i = 0; i < item.size(); i++) {
            Product2 p = (Product2) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? " " + p : ", " + p;
        }
        System.out.println("구입하신 제품의 총금액은" + sum + "만원입니다.");
        System.out.println("구입하신 제품은"+itemList+"입니다.");
        System.out.println("남은 잔액은" + money+"입니다.");
    }
}


