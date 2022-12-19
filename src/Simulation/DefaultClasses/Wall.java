package Simulation.DefaultClasses;

public class Wall {
    private WallNode firstNode;

    public WallNode getFirstNode() {
        return firstNode;
    }

    private WallNode secondNode;

    public WallNode getSecondNode() {
        return secondNode;
    }

    private Material material = Material.INTERIOR_WALL;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void destroyWall() {
        firstNode.rmWall(this);
        secondNode.rmWall(this);
        firstNode = null;
        secondNode = null;
    }

    public Wall(WallNode firstNode, WallNode secondNode) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }
}
