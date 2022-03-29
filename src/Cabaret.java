import java.util.ArrayList;
public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name)
    {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Performer> getPerformers()
    {
        return performers;
    }

    public boolean addPerformer(Performer p)
    {
        if (performers.indexOf(p) == -1)
        {
            performers.add(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean removePerformer(Performer p)
    {
        if (performers.indexOf(p) == -1)
        {
            performers.remove(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    public double averagePerformerAge()
    {
        int sum = 0;
        for (Performer p : performers)
        {
            sum += p.getAge();
        }
        double average = sum / (double) performers.size();
        return average;
    }

    public ArrayList<Performer> performersOverAge(int age)
    {
        ArrayList<Performer> overAge = new ArrayList<Performer>();
        for (Performer p : performers)
        {
            if (p.getAge() >= age)
            {
                overAge.add(p);
            }
        }
        return overAge;
    }

    public void groupRehearsal()
    {
        for (Performer p : performers)
        {
            System.out.println("REHEARSAL CALL!" + p.getName());

            if (p instanceof Comedian)
            {
                ((Comedian) p).rehearse(false);
            }
            else
            {
                p.rehearse();
            }
        }
    }

    public void cabaretShow()
    {
        for (Performer p : performers)
        {
            System.out.println("Welcome to the cabaret! Next act up..." + p.getName());
            if (p instanceof Dancer)
            {
                ((Dancer) p).pirouette(2);
            }
            p.perform();
        }
    }
}
