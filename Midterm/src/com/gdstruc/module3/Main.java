package com.gdstruc.module3;

import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Card> deck = new Stack<Card>();

        deck.push(new Card("Faker"));
        deck.push(new Card("Chovy"));
        deck.push(new Card("ShowMaker"));
        deck.push(new Card("Perkz"));
        deck.push(new Card("Nisqy"));
        deck.push(new Card("Humanoid"));
        deck.push(new Card("Doinb"));
        deck.push(new Card("Cryin"));
        deck.push(new Card("Icon"));
        deck.push(new Card("Scout"));
        deck.push(new Card("Maple"));
        deck.push(new Card("Bdd"));
        deck.push(new Card("Husky"));
        deck.push(new Card("Nomanz"));
        deck.push(new Card("Aria"));
        deck.push(new Card("Faker"));
        deck.push(new Card("Chovy"));
        deck.push(new Card("ShowMaker"));
        deck.push(new Card("Perkz"));
        deck.push(new Card("Nisqy"));
        deck.push(new Card("Humanoid"));
        deck.push(new Card("Doinb"));
        deck.push(new Card("Cryin"));
        deck.push(new Card("Icon"));
        deck.push(new Card("Scout"));
        deck.push(new Card("Maple"));
        deck.push(new Card("Bdd"));
        deck.push(new Card("Husky"));
        deck.push(new Card("Nomanz"));
        deck.push(new Card("Aria"));

        // Create the discard pile
        Stack<Card> discardPile = new Stack<>();

        // Start the game
        SimpleCardGame game = new SimpleCardGame();
        game.setDeck(deck);
        game.setDiscardPile(discardPile);

        int deckCount = 30;

        System.out.println("Number of cards in the deck: " + deckCount);

        // The first player draws 3 cards from the deck
        Card card1 = game.getCardFromDeck();
        Card card2 = game.getCardFromDeck();
        Card card3 = game.getCardFromDeck();
        Card card4 = game.getCardFromDeck();
        Card card5 = game.getCardFromDeck();

        Random rand = new Random();
        int command = rand.nextInt(3) + 1;


        if (command == 1) {
            System.out.println("The player draw from the deck ");
            int cardRNG = rand.nextInt(5) + 1;
            if (cardRNG == 1) {
                System.out.println(card1);
            }
            if (cardRNG == 2) {
                System.out.println(card1);
                System.out.println(card2);
            }
            if (cardRNG == 3) {
                System.out.println(card1);
                System.out.println(card2);
                System.out.println(card2);
            }
            if (cardRNG == 4) {
                System.out.println(card1);
                System.out.println(card2);
                System.out.println(card3);
                System.out.println(card4);
            }
            if (cardRNG == 5) {
                System.out.println(card1);
                System.out.println(card2);
                System.out.println(card3);
                System.out.println(card4);
                System.out.println(card5);
            }
        }


        // The first player discards 3 of his cards

            game.discard(card1);
            game.discard(card2);
            game.discard(card3);
            game.discard(card4);
            game.discard(card5);
        if (command == 2) {
            System.out.println("The player discard ");
            int cardRNG = rand.nextInt(5) + 1;
            if (cardRNG == 1) {
                System.out.println(game.getDiscardPile().pop());
            }
            if (cardRNG == 2) {
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
            }
            if (cardRNG == 3) {
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
            }
            if (cardRNG == 4) {
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
            }
            if (cardRNG == 5) {
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
                System.out.println(game.getDiscardPile().pop());
            }
        }

        if (command == 3) {
            System.out.println("The player draw from the discard pile ");
            int cardRNG = rand.nextInt(5) + 1;
            if (cardRNG == 1) {
                System.out.println(game.getDiscardPile().peek());
            }
            if (cardRNG == 2) {
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
            }
            if (cardRNG == 3) {
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
            }
            if (cardRNG == 4) {
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
            }
            if (cardRNG == 5) {
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
                System.out.println(game.getDiscardPile().peek());
            }
        }


    }
}