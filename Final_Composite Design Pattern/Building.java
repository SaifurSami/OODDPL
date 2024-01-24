import java.util.ArrayList;
import java.util.List;

public class Building implements HousingStructure{
    private List<HousingStructure> apartments;

    public Building()
    {
        this.apartments = new ArrayList<>();
    }
    public void addApartment(HousingStructure apartment)
    {
        apartments.add(apartment);
    }
    public void enter()
    {
        System.out.println("Entering building ");
        for(HousingStructure apartment : apartments)
        {
            apartment.enter();
        }
    }
}
