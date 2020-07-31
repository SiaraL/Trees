package pl.siara.trees.entities;

public enum LeafType {

    leaf("Leaf"),
    needle("Needle");
    
    private String type;
    
    LeafType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
