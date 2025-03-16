public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("medium");
        Table table = new Table(5, 3);
        Sofa sofa = new Sofa(50, 200);

        StandardShippingCost standardVisitor = new StandardShippingCost();
        ExpressShippingCost expressVisitor = new ExpressShippingCost();

        System.out.println("Standard Shipping Costs:");
        chair.accept(standardVisitor);
        table.accept(standardVisitor);
        sofa.accept(standardVisitor);

        System.out.println("\nExpress Shipping Costs:");
        chair.accept(expressVisitor);
        table.accept(expressVisitor);
        sofa.accept(expressVisitor);
    }
}