package com.company;

import java.util.ArrayList;

//Factory is producing opponents for arenas in game.
//There are three kinds of opponents and all of them have individual weight:
//Swordsman (1)
//Archer (2)
//Axeman (3)

public class OpponentFactory {


    public Opponent getOpponent(int randomOpponentNum) {

        if (randomOpponentNum == 1) {
            return new Swordsman();
        } else if (randomOpponentNum == 2) {
            return new Archer();
        } else if (randomOpponentNum == 3) {
            return new Axeman();
        }
        return null;
    }
}
