import java.util.ArrayList;

public class Housing implements HousingStructure{
    private String name;
    private ArrayList<HousingStructure> components;
    public Housing(String name){
        this.name=name;
        components=new ArrayList<>();
    }
    public void addComponents(HousingStructure component){
        this.components.add(component);
    }
    public void enter(){
        System.out.println("You have entered in the "+this.name);
    }
    public void exit(){
        System.out.println("You have left the "+this.name);
    }
    public void location(){
        System.out.println("You are in the "+this.name);
        System.out.println("It contains....");
        for(HousingStructure c:this.components){
            System.out.println(c.getName());
        }
    }
    public String getName(){
        return this.name;
    }
}
