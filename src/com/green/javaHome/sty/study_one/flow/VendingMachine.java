package com.green.javaHome.sty.study_one.flow;

public class VendingMachine {
    private int money;
    private String[] menuNames = {"콜라", "사이다", "환타", "미란다"};// 절차 지향
    private int[] menuPriceArr = {1000, 1500, 2000, 2500};//절차 지향으로 만드는법

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insert(5000);
        vendingMachine.showMoney();
        vendingMachine.showMenus();
        vendingMachine.purchaseDrink(3);


    }
    public void insert(int money){
        this.money += money;
    }


    public void showMoney() {
        System.out.printf("현재 잔액은 %,d원입니다.\n", this.money);
    }

    public void showMenus () {
        System.out.println("번호 \t 메뉴명\t 가격\n");
        for (int i = 0; i < menuNames.length; i++) {
            System.out.printf("%d. \t %s\t %,d원\t\n", i + 1, menuNames[i], menuPriceArr[i]);
        }

    }

    public void purchaseDrink ( int i){
        i = i - 1;
        this.money = money - menuPriceArr[i];
        System.out.printf("%s를 구입하였습니다. money값은 : %d\n", menuNames[i], this.money);
    }
}
