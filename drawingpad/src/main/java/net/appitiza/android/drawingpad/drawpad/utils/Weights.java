package net.appitiza.android.drawingpad.drawpad.utils;

public class Weights {
    public float x;
    public float y;
    public long timestamp;

    public Weights set(float x, float y) {
        this.x = x;
        this.y = y;
        this.timestamp = System.currentTimeMillis();
        return this;
    }

    public float velocityFrom(Weights start) {
        float velocity = distanceTo(start) / (this.timestamp - start.timestamp);
        if (velocity != velocity) {
            return 0f;
        }
        return velocity;
    }

    private float distanceTo(Weights point) {
        return (float) Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }
}
