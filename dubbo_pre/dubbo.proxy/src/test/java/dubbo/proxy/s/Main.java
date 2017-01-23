package dubbo.proxy.s;

import java.lang.reflect.Proxy;


public class Main {

	public static void main(String[] args) {
		//Proxy proxy = Proxy.getProxy(InterfaceTest.class);
		InterfaceTest newProxyInstance = (InterfaceTest)Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{InterfaceTest.class}, new ProxyInvokeHandler(new InterfaceTestImpl()));
	}

}
