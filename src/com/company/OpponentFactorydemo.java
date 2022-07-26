package com.company;

import java.util.ArrayList;

public class OpponentFactorydemo {

    public static void main(String[] args) {
	    int levelNumber = 10;         //how many levels game have
        int min = 1, max = 3;
        //All teams have their weight depends on lvl number
        for(int i = 1; i <= levelNumber; i++){

            int teamWeight = i * 10, sum = 0;

            ArrayList<Opponent> opponentArrayList = new ArrayList<>();

            while(sum != teamWeight) {

                OpponentFactory opponentFactory = new OpponentFactory();

                int leftPoints = teamWeight - sum;  //we need this variable to fill whole team
                int randomOpponentNum = 0;

                do{
                    randomOpponentNum = (int) (Math.random() * (max - min + 1) + min);
                }while (!(randomOpponentNum <= leftPoints));

                Opponent opponent = opponentFactory.getOpponent(randomOpponentNum);
                opponentArrayList.add(opponent);
                sum += randomOpponentNum;
            }
            System.out.println("\nLevel " + i);
            for(int j = 0; j < opponentArrayList.size(); j++){
                opponentArrayList.get(j).spawn();
            }
        }
    }
}
