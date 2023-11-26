import java.lang.reflect.*;
public class ProxyExample {
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubjectImpl();
        ProxyHandler proxyHandler=new ProxyHandler(realSubject);
        RealSubject proxy = (RealSubject) Proxy.newProxyInstance(
                RealSubject.class.getClassLoader(),
                new Class[]{RealSubject.class},
                proxyHandler
        );
        proxy.request();
    }
}
