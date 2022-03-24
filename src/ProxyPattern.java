public class ProxyPattern {
    public static void main(String[] args) {
/*
        Service1 service = new Service1();
        System.out.println(service.runSomething());
*/
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}

class Service1{
    String runSomething(){
        return "Service";
    }
}

interface IService{
    String runSomething();
}

class Service2 implements IService{
    @Override
    public String runSomething() {
        return "Service From Proxy";
    }
}

class Proxy implements IService{
    Service2 service2;

    @Override
    public String runSomething() {
        System.out.println("do proxy job");

        service2 = new Service2();
        return service2.runSomething();
    }
}