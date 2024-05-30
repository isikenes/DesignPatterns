package com.isikenes.command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands=new Command[10];
        offCommands=new Command[10];
        Command noCommand=new NoCommand();

        for(int i=0;i<10;i++) {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] =offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
