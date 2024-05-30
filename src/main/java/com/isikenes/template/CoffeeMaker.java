package com.isikenes.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk");
    }

    @Override
    boolean isCondimentWanted() {
        return getInput().equals("y");
    }

    private String getInput() {
        String answer = null;
        System.out.print("Would you like milk with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("Error");
        }
        if (answer == null) {
            return "n";
        }
        return answer;
    }
}
