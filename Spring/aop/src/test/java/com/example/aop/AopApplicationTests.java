package com.example.aop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SpringBootTest
class AopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        InvocationHandler invocationHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("hello!");
                return null;
            }
        };
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{A.class, B.class}, invocationHandler);
        A a = (A)newProxyInstance;
        B b = (B)newProxyInstance;
        a.a();
        b.b();
        System.out.println(newProxyInstance.getClass());
    }

    @Test
    public void test2() {
        Waiter manWaiter = new ManWaiter();
        ClassLoader classLoader = this.getClass().getClassLoader();
        InvocationHandler invocationHandler = new WaiterInvocationHandler(manWaiter);
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{Waiter.class}, invocationHandler);
        Waiter waiter = (Waiter)newProxyInstance;
        waiter.server();
    }

    @Test
    public void test3() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTargetObject(new ManWaiter());
        proxyFactory.setBeforeAdvice(new BeforeAdvice() {
            public void before() {
                System.out.println("你好！");
            }
        });
        proxyFactory.setAfterAdvice(new AfterAdvice() {
            public void after() {
                System.out.println("再见！");
            }
        });
        Waiter waiter = (Waiter)proxyFactory.creatProxy();
        waiter.server();
    }

    private class WaiterInvocationHandler implements InvocationHandler {
        private Waiter waiter;

        public WaiterInvocationHandler(Waiter waiter) {
            this.waiter = waiter;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("hello！");
            this.waiter.server();
            System.out.println("hello!!");
            return null;
        }
    }

}
