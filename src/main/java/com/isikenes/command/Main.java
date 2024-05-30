package com.isikenes.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        Light kitchenLight=new Light();
        TV tv=new TV();

        LightOnCommand kitchenLightOnCommand=new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand=new LightOffCommand(kitchenLight);

        TVOnCommand tvOnCommand=new TVOnCommand(tv);
        TVOffCommand tvOffCommand=new TVOffCommand(tv);

        remoteControl.setCommand(0,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControl.setCommand(1,tvOnCommand,tvOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
