package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1,"Asuna",100));
        playerList.add(new Player(2,"LethalBacon",205));
        playerList.add(new Player(3,"HPDeskjet",34));

        playerList.forEach(player -> System.out.println(player));


    }
}
