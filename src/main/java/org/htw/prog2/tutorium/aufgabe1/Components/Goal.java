package org.htw.prog2.tutorium.aufgabe1.Components;

public class Goal {
    private String icon;
    private int xposition, yposition;

    public Goal(int x, int y) {
        icon = " *";
        xposition = x;
        yposition = y;
    }

    public String getIcon() {
        return icon;
    }

    public int getXposition() {
        return xposition;
    }

    public int getYposition() {
        return yposition;
    }




}
