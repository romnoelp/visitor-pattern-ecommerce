class Table implements Furniture {
    private final double length;
    private final double width;

    public Table(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(ShippingCost visitor) {
        visitor.visitTable(this);
    }
}