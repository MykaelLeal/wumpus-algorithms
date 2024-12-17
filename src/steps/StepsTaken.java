package steps;

import java.util.LinkedList;

import map.Point;

public class StepsTaken {
    private final LinkedList<Point> path;
    private final LinkedList<Point> obstacles; 

    public StepsTaken() {
        this.path = new LinkedList<>();
        this.obstacles = new LinkedList<>();
    }

    public void addPathPoint(Point point) {
        path.add(point);
    }

    public void addObstacle(Point obstacle) {
        obstacles.add(obstacle);
    }

    public LinkedList<Point> getPath() {
        return path;
    }

    public LinkedList<Point> getObstacles() {
        return obstacles;
    }
}