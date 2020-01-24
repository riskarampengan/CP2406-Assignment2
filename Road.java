import java.awt.*;

public class Road extends Roads {
    private int road_id, next_road_id, road_length, road_width, road_height;
    private boolean traffic_light_start, traffic_light_end;
    private Color color;

    public Road(int road_id, int next_road_id, int x, int y, int road_width, int road_height, Color color) {
        super(x, y, color);

        this.road_id = road_id;
        this.next_road_id = next_road_id;
        this.road_width = road_width;
        this.road_height = road_height;
        this.road_length = road_width;
    }

    Road(int road_id, int x, int y, int road_width, int road_height, Color color) {
        super(x, y, color);

        this.road_id = road_id;
        this.road_width = road_width;
        this.road_height = road_height;
        this.road_length = road_width;
    }

    public int getRoad_id() {
        return road_id;
    }

    public void setRoad_id(int road_id) {
        this.road_id = road_id;
    }

    public int getRoad_length() {
        return road_length;
    }

    public void setRoad_length(int road_length) {
        this.road_length = road_length;
    }

    public boolean isTraffic_light_start() {
        return traffic_light_start;
    }

    public void setTraffic_light_start(boolean light_start) {
        traffic_light_start = light_start;
    }

    public boolean isTraffic_light_end() {
        return traffic_light_end;
    }

    public void setTraffic_light_end(boolean light_end) {
        traffic_light_end = light_end;
    }

    @Override
    public void car_update(int margin_width, int margin_height) {}

    public int getRoad_width() {
        return road_width;
    }

    public void setRoad_width(int road_width) {
        this.road_width = road_width;
    }

    public int getNext_road_id() {
        return  next_road_id;
    }

    public void setNext_road_id(int next_road_id) {
        this.next_road_id = next_road_id;
    }

    public int getRoad_height() {
        return road_height;
    }

    public void setRoad_height(int road_height) {
        this.road_height = road_height;
    }

    @Override
    public void car_draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x - road_width / 2, y - road_height / 2, road_width, road_height);
    }
}
