class Chair implements Furniture {
    private final String size;

    public Chair(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void accept(ShippingCost visitor) {
        visitor.visitChair(this);
    }
}