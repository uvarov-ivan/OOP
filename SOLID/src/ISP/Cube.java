package ISP;

public class Cube implements Area, Volume{
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 12 * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

    public int getEdge() {
        return edge;
    }
}
