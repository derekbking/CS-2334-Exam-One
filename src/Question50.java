public class Question50
{
    public interface MultiOp
    {
        public abstract void mult(char i);
    }

    public abstract class MultiClass implements MultiOp
    {
        double d;

        public void mult(double i)
        {
            d *= i;
        }

        /*
         * The method signature must be mult(char i) in order to override. The
         * method signature mult(int i) is not in the interface MultiOp which
         * means that this line will prevent the program from compiling. If you
         * removed @Override the program would compile because MultiClass is
         * abstract and actually does not require that all the interface methods
         * are implemented.
         */
        //@Override
        public abstract void mult(int i);
    }
}
