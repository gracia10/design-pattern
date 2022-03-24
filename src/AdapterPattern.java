public class AdapterPattern {
    public static void main(String[] args) {
/*
        Before

        ServiceA sa = new ServiceA();
        ServiceB sb = new ServiceB();

        sa.runServiceA();
        sb.runServiceB();
*/

        AdapterServiceA sa = new AdapterServiceA();
        AdapterServiceB sb = new AdapterServiceB();

        sa.runService();
        sb.runService();
    }
}

class ServiceA{
    void runServiceA(){
        System.out.println("serviceA");
    }
}

class ServiceB{
    void runServiceB(){
        System.out.println("serviceB");
    }
}

class AdapterServiceA{
    ServiceA sa = new ServiceA();
    void runService(){
        sa.runServiceA();
    }
}

class AdapterServiceB{
    ServiceB sb = new ServiceB();
    void runService(){
        sb.runServiceB();
    }
}