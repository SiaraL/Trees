package pl.siara.trees.entities;

public class LeafyTree extends Tree{

    public LeafyTree(String name, double height, double width, int branchNumber, double trunkDiameter, int age) {
        super(name, height, width, branchNumber, trunkDiameter, age);
        setType(TreeType.LeafyTree);
        setLeaf(LeafType.leaf);
    }

    @Override
    public void letOutTheFruits() {
        super.letOutTheFruits();
        System.out.println("Make a fruit of " + getName());
    }
    
    @Override
    public void grow() {
        super.grow();
        System.out.println("Grows only since spring to autumn.");
    }

}
