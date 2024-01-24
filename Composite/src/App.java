public class App {
    public static void main(String[] args) throws Exception {
        Housing building=new Housing("Wazed Mia");
        Housing department=new Housing("Cse");

        Room room1=new Room("Room1");
        Room room2=new Room("Room2");
        Room room3=new Room("Room3");

        department.addComponents(room1);
        department.addComponents(room2);
        department.addComponents(room3);

        //department.enter();
        //department.location();

        Room room4=new Room("Room4");
        Room room5=new Room("Room5");
        Room room6=new Room("Room6");

        Housing department2=new Housing("Pharmaccy");

        department2.addComponents(room4);
        department2.addComponents(room5);

        building.addComponents(department);
        building.addComponents(department2);
       
        building.location();
        
    }
}
