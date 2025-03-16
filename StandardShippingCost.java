class StandardShippingCost implements ShippingCost {
    @Override
    public void visitChair(Chair chair) {
        String size = chair.getSize();
        if ("small".equals(size)) {
            System.out.println("Chair Standard Shipping Cost: ₱10");
            return;
        }
        if ("medium".equals(size)) {
            System.out.println("Chair Standard Shipping Cost: ₱15");
            return;
        }
        System.out.println("Chair Standard Shipping Cost: ₱20");
    }

    @Override
    public void visitTable(Table table) {
        double area = table.getLength() * table.getWidth();
        if (area >= 20) {
            System.out.println("Table Standard Shipping Cost: ₱50");
            return;
        }
        if (area >= 10) {
            System.out.println("Table Standard Shipping Cost: ₱40");
            return;
        }
        System.out.println("Table Standard Shipping Cost: ₱30");
    }

    @Override
    public void visitSofa(Sofa sofa) {
        double cost = sofa.getWeight() * 0.5 + sofa.getDistance() * 0.1;
        System.out.printf("Sofa Standard Shipping Cost: ₱%.2f%n", cost);
    }
}