class Outer
{
    static int val=10;
    static void display()
    {
        System.out.println(val);
    }
    
    class Inner
    {
        public void show()
        {
            System.out.println("In Outer->Inner");
        }
    }
    static class sInner
    {
        public void show()
        {
            System.out.println("In static Inner");
        }
    }
    
}
public class helloClass
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.display();
        Outer Obj = new Outer();
        Obj.val=15;
        obj.display();
        Outer.Inner obj1 = obj.new Inner();
        Outer.sInner obj2 = new Outer.sInner();
        obj1.show();
        obj2.show();
        
    }
}
