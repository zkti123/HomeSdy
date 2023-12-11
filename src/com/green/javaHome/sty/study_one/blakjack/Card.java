package com.green.javaHome.sty.study_one.blakjack;

public class Card {
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public String toStirng() {
        return String.format("Card{%s,%s}", this.pattern, this.denomination);
    }
}
