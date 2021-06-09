import week1.factory.Formula1Tyre;
import week1.factory.Type;
import week1.factory.TyreFactory;
import week1.singleton.Singleton;
import week2.adapter.ABAdapter;
import week2.adapter.connectors.ConnectorA;
import week2.adapter.connectors.ConnectorB;
import week2.adapter.sockets.SocketA;
import week2.adapter.sockets.SocketB;
import week2.facade.MovieTheater;
import week3.iterator.OrderCollection;
import week3.iterator.OrderLister;
import week3.template.OrderTemplate1;
import week3.template.OrderTemplate2;
import week3.template.TicketProcessTemplate;
import week4.Employee;
import week4.EmployeeController;
import week4.EmployeeView;

public class Main {

    public static void main(String[] args) {

        //singletonTask();
        //factoryTask();
        //adapterPattern();
        //facadePattern();
        //iteratorPattern();
        //templatePattern();
        //MVCPattern();
    }

    public static void singletonTask(){
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.foo);
        singleton1.foo = "Tomato";

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.foo);
    }
    public static void factoryTask(){

        TyreFactory tyreFactory = new TyreFactory();

        Formula1Tyre tyre1 = tyreFactory.createTyre(Type.SOFT);
        tyre1.lastTime();

        Formula1Tyre tyre2 = tyreFactory.createTyre(Type.MEDIUM);
        tyre2.lastTime();

        Formula1Tyre tyre3 = tyreFactory.createTyre(Type.HARD);
        tyre3.lastTime();
    }
    public static void adapterPattern(){
        SocketA socketA = new SocketA();
        SocketB socketB = new SocketB();

        ConnectorA connectorA = new ConnectorA() {
            @Override
            public void connectorFunction() {
                System.out.println("Implementing interface A");
            }
        };

        ConnectorB connectorB = new ConnectorB() {
            @Override
            public void connectorFunction() {
                System.out.println("Implementing interface B");
            }
        };

        ABAdapter adapter = new ABAdapter(connectorA);

        socketA.plugIn(connectorA);
        socketB.plugIn(connectorB);

        socketB.plugIn(adapter);
    }
    public static void facadePattern(){
        MovieTheater movieTheater = new MovieTheater();
        movieTheater.startMovie();
    }
    public static void iteratorPattern(){

        OrderCollection orderCollection = new OrderCollection();
        orderCollection.addItem("first order");
        orderCollection.addItem("second order");
        orderCollection.addItem("third order");


        OrderLister orderLister = new OrderLister(orderCollection);
        orderLister.printMyOrders();
    }
    public static void templatePattern(){

        TicketProcessTemplate order1 = new OrderTemplate1();
        order1.processOrder();
        System.out.println();

        TicketProcessTemplate order2 = new OrderTemplate2();
        order2.processOrder();
        System.out.println();
    }



    public static void MVCPattern(){

        // Model data
        Employee employee1 = new Employee(1, 2000);
        Employee employee2 = new Employee(2, 2000);
        Employee employee3 = new Employee(3, 2000);
        Employee employee4 = new Employee(4, 2000);


        // View
        EmployeeView view = new EmployeeView();


        // Controller
        EmployeeController controller = new EmployeeController(view, employee1, employee2);



        controller.printInfo();

        controller.printInfo(employee4);

        controller.addEmployeeToSystem(employee3);
        controller.printInfo();

        controller.promoteEmployee(employee2);
    }


}
