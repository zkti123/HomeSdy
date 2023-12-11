package com.green.javaHome.sty.study_one.blakjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private List<Card> cardList;

    public User() {
        cardList = new ArrayList<>();
    }

    public void receiveCard(Card g) {
        cardList.add(g);
    }

    public List<Card> opneCards() {
        return cardList;
    }

    protected int getPointSum() {
        return Rule.getScore(cardList);
    }



    public void showCard() {
        System.out.println("[현제 카드 보유 목록]");
        for (Card c : cardList) {
            System.out.println(c);
        }

    }
}
