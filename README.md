# java
在 java 开发的学习和实践中，撸的各种轮子。

## 2021年7月22日

项目地址：[Spring/aop](https://github.com/you170917/java/tree/main/Spring/aop)

基于 JVM 动态代理，手写简易 AOP，实现前置处理和后置处理。

## 2021年7月27日

项目地址：[ssm/mybatis-plus](https://github.com/you170917/java/tree/main/ssm/mybatis-plus)

学习 Mybatis-Plus，参照官网，写一个 demo。

官网地址：[https://baomidou.com/guide/quick-start.html](https://baomidou.com/guide/quick-start.html)

## 2021年7月29日

项目地址：[java/threadpool](https://github.com/you170917/java/tree/main/java/threadpool)

新建了一个 Maven 空工程，在其中建两个 SpringBoot 子工程：

- threadpool-spring-boot-starter
- demo

其中，[threadpool-spring-boot-starter](https://github.com/you170917/java/tree/main/java/threadpool/threadpool-spring-boot-starter) 就是一个简易的线程池。

然后在 demo 工程的 pom 文件中，引入 threadpool-spring-boot-starter 依赖：

```
        <dependency>
            <groupId>com.example</groupId>
            <artifactId>threadpool-spring-boot-starter</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

就可以在 demo 中进行测试。