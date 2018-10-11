import java.util.ArrayList;

public class Question33
{
    public static void main(String[] args)
    {
        ArrayList<Integer> vals = new ArrayList<Integer>();

        /*
         * Redundant boxing of integers ArrayList<Integer> will accept primitive
         * data types too.
         */
        vals.add(new Integer(31));
        vals.add(new Integer(41));
        vals.add(new Integer((int) 59.1));

        /*
         * ArrayList#set takes (int index, E element) where E is type of
         * ArrayList. So both these lines update index 1 of the ArrayList,
         * however, the final values is 119 because that assignment of index 1
         * comes last.
         */
        vals.set(1, 2);
        vals.set(1, new Integer(119));

        System.out.println(vals.get(1));
    }
}
