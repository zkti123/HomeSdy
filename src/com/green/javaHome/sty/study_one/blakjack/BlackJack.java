package com.green.javaHome.sty.study_one.blakjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Gamer gamer = new Gamer();

        Dealer dealer = new Dealer();

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cardDeck.getCard());
            dealer.receiveCard(cardDeck.getCard());
        }

        if (dealer.isReceiveCard()) {
            dealer.receiveCard(cardDeck.getCard());
        }
        gamer.showCard();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Card More? (y/n)");
            String answer = scan.nextLine();
            if ("n".equals(answer.trim().toLowerCase())) {
                break;
            }
            gamer.receiveCard(cardDeck.getCard());
            gamer.showCard();
        }
        dealer.showCard();
        Rule.whoIsWin(gamer,dealer);
    }


}
