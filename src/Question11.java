public class Question11
{
    public static void main(String[] args)
    {
        int i1 = 3;
        int i2 = 4;
        int i3 = 5;

        /*
         * https://introcs.cs.princeton.edu/java/11precedence/ good resource
         * for learning about Java's order of operations. In general Java
         * follows the order that you would expect. Multiplication first then
         * addition according to associativity which is not important in this
         * case because addition is commutative.
         */
        System.out.println(1 + i1 * i2 + i3);
    }
}
