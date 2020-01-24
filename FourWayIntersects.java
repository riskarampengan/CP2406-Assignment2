import java.awt.*;

public class FourWayIntersects extends Road {
    private int way_to_south_id, way_to_north_id, way_to_west_id, way_to_east_id;

    public FourWayIntersects(int road_id, int way_to_south_id, int way_to_north_id, int way_to_west_id,
                             int way_to_east_id, int x, int y, int road_width, int road_height, Color color) {
        super(road_id, x, y, road_height, road_width, color);

        this.way_to_east_id = way_to_east_id;
        this.way_to_north_id = way_to_north_id;
        this.way_to_south_id = way_to_south_id;
        this.way_to_west_id = way_to_west_id;
    }
}
