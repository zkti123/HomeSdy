package com.green.javaHome.sty.study_one.blakjack;

import java.util.List;

public class Rule {
    public static final int BLACKJACK_SCORE = 21;
    public static int getScore(List<Card> cardLIst) {
        int sum = 0;
        for (Card c : cardLIst) {
            sum += getDenominationToNum(c);
            System.out.println(c.getDenomination());

        }
        return sum;
    }

    public static int getDenominationToNum(Card c2) {
        switch (c2.getDenomination()) {
            case "A" : return 1;
            case "J" :
            case "Q" :
            case "K" :
                return 10;
            default:
                return Integer.parseInt(c2.getDenomination());
        }
    }

    public static void whoIsWin(Gamer gamer, Dealer dealer) {
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();

        if( gPoint <= BLACKJACK_SCORE && (gPoint > dPoint || dPoint > BLACKJACK_SCORE) ) {
            System.out.println("게이머 승리");
        } else if( dPoint <= BLACKJACK_SCORE && (dPoint > gPoint || gPoint > BLACKJACK_SCORE) ) {
            System.out.println("딜러 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
