package com.isikenes.state;

public class Player {
    private State idleState;
    private State chaseState;
    private State deadState;
    private State state;

    public Player() {
        idleState=new IdleState(this);
        chaseState=new ChaseState(this);
        deadState=new DeadState(this);

        state=idleState;
    }

    public void run() {
        state.run();
    }

    public void shoot() {
        state.shoot();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getChaseState() {
        return chaseState;
    }

    public State getDeadState() {
        return deadState;
    }
}
