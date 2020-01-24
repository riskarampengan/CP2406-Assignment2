import java.awt.*;

public abstract class Vehicle {
    public int x, y;
    protected final Color color;
    protected int x_dir, y_dir;
    public float x_speed, y_speed;

    protected Vehicle(int x, int y, Color color, int x_v, int y_v) {
        this.x = x;
        this.y = y;
        this.color = color;

        x_dir = +1;
        y_dir = +1;

        x_speed = x_v;
        y_speed = y_v;
    }

    protected void vehicle_move() {
        x += (int) x_speed * x_dir;
        y += (int) y_speed * y_dir;
    }
}
