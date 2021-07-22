package com.example.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/22 20:14
 */
public class ProxyFactory {
    private Object targetObject;
    private AfterAdvice afterAdvice;
    private BeforeAdvice beforeAdvice;

    public ProxyFactory() {
    }

    public Object creatProxy() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = this.targetObject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (ProxyFactory.this.beforeAdvice != null) {
                    ProxyFactory.this.beforeAdvice.before();
                }

                Object target = method.invoke(ProxyFactory.this.targetObject, args);
                if (ProxyFactory.this.afterAdvice != null) {
                    ProxyFactory.this.afterAdvice.after();
                }

                return target;
            }
        };
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return newProxyInstance;
    }

    public Object getTargetObject() {
        return this.targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public AfterAdvice getAfterAdvice() {
        return this.afterAdvice;
    }

    public void setAfterAdvice(AfterAdvice afterAdvice) {
        this.afterAdvice = afterAdvice;
    }

    public BeforeAdvice getBeforeAdvice() {
        return this.beforeAdvice;
    }

    public void setBeforeAdvice(BeforeAdvice beforeAdvice) {
        this.beforeAdvice = beforeAdvice;
    }
}
