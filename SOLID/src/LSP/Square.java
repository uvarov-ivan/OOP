package LSP;

public class Square extends Rectangle{

    private int side;
    
    @Override
    public void setWidth(int side) {
        this.side = side;
    }

    @Override
    public void setHeight(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
