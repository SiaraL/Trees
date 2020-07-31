package pl.siara.trees.entities;

public enum TreeType {

    LeafyTree("It is leaf tree"),
    ConiferTree("It is conifer tree");
    
    String type;
    
    TreeType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
