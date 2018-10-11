public class Question4To8
{
    public Question4To8()
    {
        /*
         * Question 4
         */
        System.out.println(mulitCompare(2));

        /*
         * Question 5
         */
        System.out.println(mulitCompare(4));

        /*
         * Question 6
         */
        System.out.println(mulitCompare(null));

        /*
         * Question 7
         */
        try
        {
            System.out.println(mulitCompare(7));
        }
        catch (IllegalArgumentException e)
        {
            /*
             * We expect an IllegalArgumentException to be thrown this will
             * print that exception to console.
             */
            e.printStackTrace();
        }

        /*
         * Question 8
         */
        try
        {
            System.out.println(mulitCompare(77));
        }
        catch (IllegalArgumentException e)
        {
            /*
             * We expect an IllegalArgumentException to be thrown this will
             * print that exception to console.
             */
            e.printStackTrace();
        }
    }

    public static int compareWithLimit(Integer v)
    {
        if (v > 8)
        {
            throw new IllegalArgumentException("Too big");
        }
        return 5 / (v - 3);
    }

    public static int mulitCompare(Integer b)
    {
        Integer a = null;

        try
        {
            if (b > 5)
            {
                return compareWithLimit(b + 3);
            }
            else if (b < 0)
            {
                return compareWithLimit(a);
            }
            else
            {
                return compareWithLimit(b);
            }
        }
        catch (NullPointerException e)
        {
            return 5;
        }
    }

    public static void main(String[] args)
    {
        new Question4To8();
    }
}
