public class TryException
{
    public static void main(String[] args)
    {
        try
        {
            int n=7;
            int m=0;
            int o=n/m;
            System.out.println("Output is "+o);
        }
        catch(Exception e)
        {
            System.out.println("denomator is zero!");
        }
        System.out.println("Execution completed.");
    }
}
