package com.green.javaHome.sty.study_one.programming_language2;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는" + b.bonusPoint+"점입니다.");
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이부족하여 물건을 살수 없습니다");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"를 구입하셨습니다");
    }
}