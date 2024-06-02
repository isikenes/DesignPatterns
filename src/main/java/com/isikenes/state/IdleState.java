package com.isikenes.state;

public class IdleState implements State{
    Player player;

    public IdleState(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        System.out.println("Chasing after enemy");
        player.setState(player.getChaseState());
    }

    @Override
    public void shoot() {
        System.out.println("No enemy detected");
    }
}
