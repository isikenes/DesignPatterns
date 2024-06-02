package com.isikenes.state;

public class ChaseState implements State{
    Player player;

    public ChaseState(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        System.out.println("Still running");
    }

    @Override
    public void shoot() {
        System.out.println("Shooting to enemy");
        if(Math.random()>0.5) {
            System.out.println("Enemy is dead");
            player.setState(player.getIdleState());
        } else{
            System.out.println("Player is dead");
            player.setState(player.getDeadState());
        }
    }
}
