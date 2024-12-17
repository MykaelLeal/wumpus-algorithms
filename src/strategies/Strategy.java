package strategies;

import java.util.List;

import map.GameMap;
import map.Point;

public interface Strategy {
    public Point evaluatePossbileNextStep(List<Point> possibleNextStep, GameMap map);
}