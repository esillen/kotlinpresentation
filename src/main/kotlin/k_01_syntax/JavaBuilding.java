package k_01_syntax;



// Building with some mutable fields
public class JavaBuilding {

    private LegalPerson owner = new LegalPerson("The state");
    private String name = "unnamed";
    private String color = "Gray";

    public LegalPerson getOwner() {
        return owner;
    }

    public void setOwner(LegalPerson owner) {
        this.owner = owner;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        //if (color == "UltraUgly") {
        //    throw new IllegalArgumentException("Too ugly");
        //}
        this.color = color;
    }
}
