package dubbo.proxy.s;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvokeHandler implements InvocationHandler {

	private  InterfaceTest test;
	public ProxyInvokeHandler(InterfaceTest test) {
		// TODO Auto-generated constructor stub
		this.test=test;
	}
	public InterfaceTest getTest() {
		return test;
	}

	public void setTest(InterfaceTest test) {
		this.test = test;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		test.hello();
		return null;
	}

}
