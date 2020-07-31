package pl.siara.trees.entities;

public class ConiferTree extends Tree{

    public ConiferTree(String name, double height, double width, int branchNumber, double trunkDiameter, int age) {
        super(name, height, width, branchNumber, trunkDiameter, age);
        setType(TreeType.ConiferTree);
        setLeaf(LeafType.needle);
    }

    @Override
    public void letOutTheFruits() {
        super.letOutTheFruits();
        System.out.println("Make a cone");
    }
    
    @Override
    public void grow() {
        super.grow();
        System.out.println("Grows all year round");
    }
}
