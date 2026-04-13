package org.APCSLowell;

public class APLine {
    int a, b, c;
    public APLine(int a, int b, int c) {}
    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
    public double getSlope() {
        return -(double)a / (double)b;
    }
}
