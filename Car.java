import java.awt.*;

public class Car extends Vehicle {
    //Local Variables
    private final int car_id, car_width, car_height;
    private int front_car, on_road, car_length;
    private boolean to_west, to_east, to_south, to_north, car_stopped, slowing_down, end_of_road;

    //Car Object Initializer
    public Car(int car_id, int x, int y, int car_width, int car_height, Color color, int x_speed, int y_speed) {
        super(x, y, color, x_speed, y_speed);

        this.car_id = car_id;
        this.car_width = car_width;
        this.car_height = car_height;
    }

    public Car(int car_id, int front_car, int x, int y, int car_width, int car_height, Color color, int x_speed,
               int y_speed) {
        super(x, y, color, x_speed, y_speed);

        this.car_id = car_id;
        this.front_car = front_car;
        this.car_width = car_width;
        this.car_height = car_height;
    }

    private boolean car_stopped() {
        return car_stopped;
    }

    private void set_car_stopped() {
        car_stopped = true;
    }

    private boolean slowing_down() {
        return slowing_down;
    }

    private void set_car_slow_down() {
        slowing_down = true;
    }

    private void set_end_of_road() {
        this.end_of_road = true;
    }

    public int getCar_id() {
        return car_id;
    }

    public int getFront_car() {
        return front_car;
    }

    private int getCar_width() {
        return car_width;
    }

    private int getOn_road() {
        return on_road;
    }

    public void set_on_road(int on_road) {
        this.on_road = on_road;
    }

    private void car_update(int margin_width, int margin_height) {
        //This function is for the cars that reached the limit of the roads in the frame.
        if ((x - car_width / 2 < 0 && x_dir < 0) || (x + car_width / 2 > margin_width && x_dir > 0)) {
            this.set_end_of_road();
        }

        if ((y - car_height / 2 < 0 && y_dir < 0) || (y + car_height / 2 > margin_height && y_dir > 0)) {
            this.set_end_of_road();
        }
    }

    public void car_draw(Graphics graphics) {
        //Draw the cars specifically depend on the direction of each car.
        if (to_east) {
            graphics.setColor(color);
            graphics.fillRect(x - car_width / 2, y - car_height / 2, car_width, car_height);
        } else if (to_west) {
            graphics.setColor(color);
            graphics.fillRect(x - car_width / 2, y - car_height / 2, car_width, car_height);
        } else if (to_north) {
            graphics.setColor(color);
            graphics.fillRect(x - car_width / 2, y - car_height / 2, car_width, car_height);
        } else if (to_south) {
            graphics.setColor(color);
            graphics.fillRect(x - car_width / 2, y - car_height / 2, car_width, car_height);
        } else if (end_of_road) {
            graphics.clearRect(x - car_width / 2, y - car_height / 2, car_width, car_height);
            graphics.setColor(color);
            graphics.fillRect(x - car_width / 2, y - car_height / 2, car_width, car_height);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x + car_width / 10, y - car_height / 2, car_width / 10, car_height);
        }
    }

    private void car_slowing_down(float new_speed) {
        //New speed subtracted from the initial speed
        if (to_east || to_west) {
            //If the car is going to east or west direction, the x_speed decrease
            if (x_speed >= 0) {
                this.set_car_slow_down();
                this.car_stopped = false;

                x_speed -= new_speed;

                if (x_speed <= 0) {
                    this.car_stop();
                }
            }
        } else if (to_south || to_north) {
            //If the car is going to south or north direction, the y_speed decrease
            if (y_speed >= 0) {
                this.set_car_slow_down();
                this.car_stopped = false;

                y_speed -= new_speed;

                if (y_speed <= 0) {
                    this.car_stop();
                }
            }
        }
    }

    private void car_speed_up(float new_speed) {
        //New speed added from the initial speed
        if (to_east || to_west) {
            //If the car is going to east or west direction, the x_speed increase
            if (this.x_speed <= 6) {
                this.x_speed += new_speed;
            }

            this.car_stopped = false;
            this.slowing_down = false;
        } else if (to_south || to_north) {
            //If the car is going to south or north direction, the y_speed increase
            if (this.y_speed <= 6) {
                this.y_speed += new_speed;
            }

            this.car_stopped = false;
            this.slowing_down = false;
        }
    }

    private void car_stop() {
        // Set the car speed to 0 depends on the directions
        if (to_west || to_east) {
            x_speed = 0;

            this.set_car_stopped();
            this.slowing_down = false;
        } else if (to_south || to_north) {
            y_speed = 0;

            this.set_car_stopped();
            this.slowing_down = false;
        }
    }

    public void front_of_car(TrafficLight traffic_light, Car next_of_car, float car_speed, int margin_width,
                             int margin_height, boolean road_intersections) {
        float road_shifting = 0;

        if (road_intersections) {
            road_shifting = this.car_width * 4;
        }

        if ((traffic_light.getOn_road() == this.getOn_road()) || (traffic_light.getNext_road() == this.getOn_road())) {
            //Car going west
            if (to_west) {
                if (traffic_light)
            }
        }
    }
}
