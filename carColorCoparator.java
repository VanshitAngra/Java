import java.util.Comparator;

public class carColorCoparator implements Comparator<car> {
    public int compare(car o1,car o2)
    {   
        return o1.color.compareTo(o2.color);
    }
}
