public class Sign
{
    private String message;
    private int width;

    public Sign(String msg, int w)
    {
        message = msg;
        width = w;
    }

    public int numberOfLines()
    {
        return message.length() / width + 1;
    }

    public String getLines()
    {
        return null;
    }

}