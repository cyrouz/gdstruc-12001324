package com.gdstruc.module3;

import java.util.Stack;

public class CardGame {

    // Draw deck
    private Stack<Card> deck;

    // Discard pile
    private Stack<Card> discardPile;

    public Card getCardFromDeck() {
        return deck.pop();
    }

    public void discard(Card card) {
        discardPile.push(card);
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public Stack<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public void setDiscardPile(Stack<Card> discardPile) {
        this.discardPile = discardPile;
    }

    // ...getters, setters, etc.
}
