package pl.siara.trees;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import pl.siara.trees.entities.ConiferTree;
import pl.siara.trees.entities.LeafyTree;
import pl.siara.trees.entities.Tree;
import pl.siara.trees.entities.TreeType;

@RunWith(SpringRunner.class)
class TreesApplicationTests {

    List<Tree> list = new ArrayList<>();

    TreesApplicationTests() {
        Tree appleTree = new LeafyTree("Apple Tree", 10.8, 3.9, 90, 0.5, 11);
        Tree oakTree = new LeafyTree("Oak", 21.5, 9.8, 200, 1.1, 150);
        Tree alderTree = new LeafyTree("Alder", 8.0, 3.5, 150, 0.8, 20);
        Tree firTree = new ConiferTree("Fir ", 15.21, 2.7, 350, 0.65, 8);
        Tree spruceTree = new ConiferTree("Sruce", 5.6, 4.1, 210, 0.78, 5);
        list.add(appleTree);
        list.add(oakTree);
        list.add(alderTree);
        list.add(firTree);
        list.add(spruceTree);
    }

    @Test
    void getAllTrees() {
        System.out.println("\nList of created trees:");
        list.forEach(System.out::println);
    }

    @Test
    void getAllLefyTrees() {
        System.out.println("\nList of leafy trees:");
        list.stream().filter(x -> x.getType() == TreeType.LeafyTree).forEach(System.out::println);
    }
    
    @Test
    void getAllConiferTrees() {
        System.out.println("\nList of conifer trees:");
        list.stream().filter(x -> x.getType() == TreeType.ConiferTree).forEach(System.out::println);
    }
    
    @Test
    void checkHowItGrow() {
        System.out.println("\nHow it grows?:");
        list.forEach(x -> {System.out.println(x.getName() + ": ");  x.grow();});
    }
    
    @Test
    void checkFruitOfTree() {
        System.out.println("\nWhat fruits does it produce?:");
        list.forEach(x -> {System.out.println(x.getName() + ": ");  x.letOutTheFruits();});
    }
    
}
