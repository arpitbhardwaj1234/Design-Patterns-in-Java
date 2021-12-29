import java.util.Locale;

public class Factory {

    OS getObject(String s)
    {
        if(s.toLowerCase()=="android")
        {
            return new Android();
        }
        else if(s.toLowerCase()=="ios")
        {
            return new Ios();
        }
        else
        {
            return new Windows();
        }
    }
}
