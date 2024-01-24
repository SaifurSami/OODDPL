public class Room implements HousingStructure {
    private String name;

    public Room(String name)
    {
        this.name = name;
    }
    public void enter()
    {
        System.out.println("Entering room"+name);
    }
    
}
