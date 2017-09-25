package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.fullName = "Dan";
//	    player.health = 20;
//	    player.weapon = "Gun";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Dan", 200, "Gun");
        System.out.println("Initial health is " + player.getHealth());
    }
}
