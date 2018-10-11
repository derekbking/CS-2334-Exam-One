public class Question29
{
    private String name = "NoName";
    private int id = -1;

    public void setName(String inName)
    {
        name = inName;
    }

    public void setRating(int id)
    {
        /*
         * Should be this.id = id for the global variable id to be properly
         * assigned.
         */
        id = id;
    }

    public void print()
    {
        System.out.println(name + " −− " + id);
    }

    public static void main(String[] args)
    {
        Question29 r = new Question29();

        r.print();
    }
}
