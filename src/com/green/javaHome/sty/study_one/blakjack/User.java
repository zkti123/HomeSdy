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

    public List<Card> openCards() {
        return cardList;
    }

    protected int getPointSum() {
        return Rule.getScore(cardList);
    }

    public List<Card> opneCards() {
        return cardList;
    }

    private int getDenominationToNum(Card c2) {
        switch (c2.getDenomination()) {
            case "A" :
                return 1;
            case "J" :
            case "Q" :
            case "K" :
                return 10;
            default:
                return Integer.parseInt(c2.getPattern());
        }
    }

    public void showCard() {
        System.out.println("[현제 카드 보유 목록]");
        for (Card c : cardList) {
            System.out.println(c);
        }
    }
}
