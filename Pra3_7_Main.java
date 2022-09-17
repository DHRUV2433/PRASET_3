//This program is run by Dhruv Vekariya(21CE152)
interface P3_7
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
class Pra3_7_Main implements P3_7
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        Pra3_7_Main d = new Pra3_7_Main();
        d.square(4);

        // default method executed
        d.show();
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}
