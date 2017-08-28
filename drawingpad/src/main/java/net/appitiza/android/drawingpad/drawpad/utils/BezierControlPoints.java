package net.appitiza.android.drawingpad.drawpad.utils;

public class BezierControlPoints {

    public Weights c1;
    public Weights c2;

    public BezierControlPoints set(Weights c1, Weights c2) {
        this.c1 = c1;
        this.c2 = c2;
        return this;
    }

}
