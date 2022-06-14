package SingletonPattern;

public class Object {
    private static Object instance = new Object();
    private Object(){};
    public static Object getInstance(){
        return instance;
    }
    public void sendMessage(){
        System.out.println("IM HERE");
    }

}
