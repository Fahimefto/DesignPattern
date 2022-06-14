package CompositePattern;

public class Demo {
    public static void main(String[] args) {
        Employee emp1= new Cashier(69,"Abid",5);
        Employee emp2= new Cashier(6969,"Anindo",6);
        Employee emp3= new Accountant(9696,"Zubaer",100000);
        Employee manager1= new BankManager(1,"EFTO",1000000);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
    }
}
