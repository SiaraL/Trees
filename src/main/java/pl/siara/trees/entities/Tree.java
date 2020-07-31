package pl.siara.trees.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Tree implements TreeFunctionality{

	private String name;
	private double height; 
	private double width;
	private int branchNumber;
	private double trunkDiameter;
	private int age;
	private LeafType leaf;
	private TreeType type;
	
	public Tree(String name, double height, double width, int branchNumber, double trunkDiameter, int age) {
	    this.name = name;
	    this.height = height;
	    this.width = width;
	    this.branchNumber = branchNumber;
	    this.trunkDiameter = trunkDiameter;
	    this.age = age;
	}
	
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void letOutTheFruits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void throwFruit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeRoot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lengthenBranches() {
		// TODO Auto-generated method stub
		
	}

}
