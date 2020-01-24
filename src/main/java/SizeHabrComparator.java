import java.util.Comparator;

public class SizeHabrComparator implements Comparator<Deputat> {
    @Override
    public int compare(Deputat o1, Deputat o2) {
        if (o1.getInthabr()>o2.getInthabr())
            return -1;
        else if (o1.getInthabr()<o2.getInthabr())
            return 1;
        else
            return 0;
    }
}

