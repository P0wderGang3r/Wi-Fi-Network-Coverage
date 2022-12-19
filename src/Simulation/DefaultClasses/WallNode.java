package Simulation.DefaultClasses;

import java.util.ArrayList;
import java.util.List;

public class WallNode {
    private double coordX;

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    private double coordY;

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    private List<Wall> wallList = new ArrayList<>();

    public List<Wall> getWallList() {
        return wallList;
    }

    public void setWallList(List<Wall> wallList) {
        this.wallList = wallList;
    }
    
    public void createWall(WallNode wallNode, Material material) {
        assert wallNode != null;
        assert !this.equals(wallNode);
        this.wallList.add(new Wall(this, wallNode));
    }

    public void rmWall(Wall wall) {
        this.wallList.remove(wall);
    }

    public void rmThisWallNode() {
        for (var wall: wallList) {
            wall.destroyWall();
        }
    }

    public WallNode(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
}
