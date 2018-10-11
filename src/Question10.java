public class Question10
{
    public static void main(String[] args)
    {
        int a = 17;
        int b = 25;

        /*
         * Integer division will truncate the decimals on the result. So in our
         * case 25 divided by 17 is equal to approximately 1.47, however, all
         * decimals are truncated resulting in 1.
         */
        System.out.println(b/a);
    }
}
