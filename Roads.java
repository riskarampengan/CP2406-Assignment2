import java.awt.*;

public abstract class Roads {
    public final int x, y;
    private final Color color;

    public Roads(int x, int y, Color road_color) {
        this.x = x;
        this.y = y;

        color = road_color;
    }

    public abstract void car_update(int margin_width, int margin_height);
    public abstract void car_draw(Graphics graphics);
}
