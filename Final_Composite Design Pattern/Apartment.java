import java.util.ArrayList;
import java.util.List;

public class Apartment implements HousingStructure {
    private List<HousingStructure> rooms;

    public Apartment()
    {
        this.rooms = new ArrayList<>();
    }
    public void addRoom(HousingStructure room)
    {
        rooms.add(room);
    }
    public void enter() {
        System.out.println("Entering apartment...");
        for (HousingStructure room : rooms) {
            room.enter();
        }
    }
    
}
