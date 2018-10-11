public class Question39To44
{
    public Question39To44()
    {
        /*
         * Extra brackets are used to control the variable scope and avoid
         * conflicting variable names.
         */

        /*
         * Question 39
         */
        {
            X x = new X(17);
            /*
             * The X class does not have the method superString. This code will not
             * compile.
             */
            //System.out.println(x.superString());
        }

        /*
         * Question 40
         */
        {
            X x = new X(17);
            /*
             * This code does no compile. Naming the variable x was actually a
             * typo so answers A or E are acceptable.
             */
            //System.out.println(x1.getDescriptor());

            /*
             * Corrected code.
             */
            X x1 = new X(17);
            System.out.println(x1.getDescriptor());
        }

        /*
         * Question 41
         */
        {
            Y y1 = new Y("Sam", 7);
            System.out.println(y1.superString());
        }

        /*
         * Question 42
         */
        {
            Y y1 = new Y("Sam", 7);
            System.out.println(y1);
        }

        /*
         * Question 43
         */
        {
            /*
             * Z is a subclass of Y and Y is a subclass of X so defining the
             * variable x as type X and assigning it to an object of type Z is
             * valid. Y overrides toString so the toString format used in Y
             * will be used when printing out the value of object x despite
             * toString being defined in X because Y overrides that toString
             * method.
             */
            X x = new Z("Sam", 42);
            System.out.println(x);
        }

        /*
         * Question 44
         *
         * This question seems identical to 42. Not sure what the difference is
         * especially considering the answers are the exact same.
         */
        {
            X x = new Z("Sam", 42);
            System.out.println(x);
        }
    }

    public class X
    {
        protected int x;

        public X(int inId)
        {
            x = inId;
        }

        public int getID()
        {
            return x;
        }

        public String toString()
        {
            return "X: " + x;
        }

        public String getDescriptor()
        {
            return "D: " + this.getID();
        }
    }

    public class Y extends X
    {
        protected String id;

        public Y(String id, int val)
        {
            super(val);
            this.id = id;
        }

        public String toString()
        {
            return this.x + ": " + this.id;
        }

        public String superString()
        {
            return super.toString();
        }
    }

    public class Z extends Y
    {
        private int id;

        public Z(String s, int id)
        {
            super(s, id + 10);
            this.id = id;
        }

        public int getID()
        {
            return this.id;
        }
    }

    public static void main(String[] args)
    {
        /*
         * Internal classes cannot be accessed from a static context so these
         * classes must be tested from within an instance of Question39To44.
         */
        new Question39To44();
    }
}
