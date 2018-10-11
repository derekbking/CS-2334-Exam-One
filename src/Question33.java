import java.util.ArrayList;

public class Question33
{
    public static void main(String[] args)
    {
        ArrayList<Integer> vals = new ArrayList<Integer>();

        vals.add(new Integer(31));
        vals.add(new Integer(41));
        vals.add(new Integer((int) 59.1));
        vals.set(1, 2);
        vals.set(1, new Integer(119));

        System.out.println(vals.get(1));
    }
}
