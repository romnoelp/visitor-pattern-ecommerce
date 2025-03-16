class ExpressShippingCost implements ShippingCost {
    @Override
    public void visitChair(Chair chair) {
        String size = chair.getSize();
        if ("small".equals(size)) {
            System.out.println("Chair Express Shipping Cost: ₱20");
            return;
        }
        if ("medium".equals(size)) {
            System.out.println("Chair Express Shipping Cost: ₱30");
            return;
        }
        System.out.println("Chair Express Shipping Cost: ₱40");
    }

    @Override
    public void visitTable(Table table) {
        double area = table.getLength() * table.getWidth();
        if (area >= 20) {
            System.out.println("Table Express Shipping Cost: ₱90");
            return;
        }
        if (area >= 10) {
            System.out.println("Table Express Shipping Cost: ₱70");
            return;
        }
        System.out.println("Table Express Shipping Cost: ₱50");
    }

    @Override
    public void visitSofa(Sofa sofa) {
        double cost = sofa.getWeight() * 1 + sofa.getDistance() * 0.2;
        System.out.printf("Sofa Express Shipping Cost: ₱%.2f%n", cost);
    }
}
