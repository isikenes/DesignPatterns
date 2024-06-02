package com.isikenes.state;

public class DeadState implements State{
    Player player;

    public DeadState(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        System.out.println("Player can't run when dead");
    }

    @Override
    public void shoot() {
        System.out.println("Player can't shoot when dead");
    }
}
