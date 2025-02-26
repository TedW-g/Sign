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
        String s = "";
        int i = 0;
        while (i < message.length())
        {
            s += message.substring(i,i+1);
            if (i % width == 0) s += ";" + message.substring(i,i+1);
            i++;
        }
        return s + "a";
    }

}