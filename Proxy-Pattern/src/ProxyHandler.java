import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class ProxyHandler implements InvocationHandler{
    private final RealSubject realSubject;

    public ProxyHandler(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy: Pre-processing request.");
        Object result=method.invoke(realSubject,args);
        System.out.println("Proxy: Post-processing request.");
        return result;
    }
}
