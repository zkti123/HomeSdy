package com.green.javaHome.sty.study_one.blakjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTENRS = {"♠", "♥", "♣", "♦"};
    private static int CARD_COUNT = 13;

    private List<Card> cardList;

    CardDeck() {
        this.cardList = new ArrayList<>();

        for (String pattern : PATTENRS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                this.cardList.add(new Card(pattern, getDenominatoin(i)));
            }
        }

    }

    public void showSize() {
        System.out.println(cardList.size());
    }

    private String getDenominatoin(int num) {
        switch (num) {
            case 1 :
                return "A";
            case 11 :
                return "J";
            case 12 :
                return "Q";
            case 13 :
                return "K";
            default:
                return String.valueOf(num);
        }
    }

    public Card getCard() {
        int rIdx = (int) (Math.random() * cardList.size());

        return cardList.remove(rIdx);
    }
}
