public class Main
{

public static void main(String[] args) 
{
    String str;
    int x;
    Sign sign = new Sign("ABC222DE", 3);

    x = sign.numberOfLines();
    System.out.println(x);

    str = sign.getLines();
    System.out.println(str);
}

}