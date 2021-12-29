public class Main {

    public static void main(String args[])
    {
        Factory f=new Factory();
        OS os=f.getObject("android");
        os.spec();
        os=f.getObject("ios");
        os.spec();
    }
}
