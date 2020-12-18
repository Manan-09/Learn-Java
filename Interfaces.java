interface writer
{
    void show();
}
class pen implements writer
{
    public void show()
    {
        System.out.println("Writing with pen.");
    }
}
class pencil implements writer
{
    public void show()
    {
        System.out.println("Writing with pencil.");
    }
}
class kit
{
    public void show(writer p)
    {
        p.show();
    }
}
public class interfaces
{
    public static void main(String[] args)
    {
        kit k=new kit();
        writer obj=new pen();
        k.show(obj);
        obj=new pencil();
        k.show(obj);

        obj= new writer(){
            public void show()
            {
                System.out.println("Just keeping in mind");
            }
        };
        obj.show();

    }
}
