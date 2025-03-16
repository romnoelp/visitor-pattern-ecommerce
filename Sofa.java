class Sofa implements Furniture {
    private final double weight;
    private final double distance;

    public Sofa(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(ShippingCost visitor) {
        visitor.visitSofa(this);
    }
}