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
        if(message.length() % width == 0) return message.length() / width;
        return message.length() / width + 1;
    }

    public String getLines()
    {
        String s = "";
        int i = 0;
        if(message.length() == 0) return null;
        while (i < message.length())
        {
            s += message.substring(i,i+1);
            if ((i > 0) && (i+1) % width == 0)
            {
                if(i+1 != message.length()) s += ";";
            }
            i++;
        }
        return s;
    }
//ABC222DE
}