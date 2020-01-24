import java.awt.*;

public abstract class TrafficLight {
    public int x, y;
    protected int width, height;
    private final boolean green_light;

    protected TrafficLight(int x, int y, Boolean green_light) {
        this.x = x;
        this.y = y;
        this.green_light = green_light;
    }

    public abstract void car_draw(Graphics graphics);
}
