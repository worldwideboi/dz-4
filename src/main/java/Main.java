public class Main
{
    public static void main(String[] args)
    {
        App secondObject = new App();
        int value = secondObject.getFieldValue();
        System.out.println("~~~ " + value + " ~~~");
    }
}