package SingletonPattern;

public class Demo {
    public static void main(String[] args) {
        Object object1= Object.getInstance();
        object1.sendMessage();
    }
}
