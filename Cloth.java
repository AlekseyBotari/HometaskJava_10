public abstract class Cloth {
    int cost;
    String colour;
    Size size;

    public Cloth(int cost, String colour, Size size) {
        this.cost = cost;
        this.colour = colour;
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public String getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }
}
