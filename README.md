# java
在 java 开发的学习和实践中，撸的各种轮子。

## 2021年8月2日

**SpringBoot+mybatis 切换多数据源**

项目地址：[ssm/SwitchingMultipleDatasources](https://github.com/you170917/java/tree/main/ssm/SwitchingMultipleDatasources)

注意：Springboot2.0 在配置数据库连接的时候需要使用 `jdbc-url`，如果只使用 url 的话会报
`jdbcUrl is required with driverClassName.`错误。

```properties
# 多数据源切换，这是 security 数据库
spring.datasource.one.type=com.alibaba.druid.pool.DruidDataSource
spring.datasource.one.username=root
spring.datasource.one.password=123456
spring.datasource.one.jdbc-url=jdbc:mysql://127.0.0.1:3306/security?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8

# 多数据源切换，这是 vhr 数据库
spring.datasource.two.type=com.alibaba.druid.pool.DruidDataSource
spring.datasource.two.username=root
spring.datasource.two.password=123456
spring.datasource.two.jdbc-url=jdbc:mysql://127.0.0.1:3306/vhr?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8
```



## 2021年7月29日

**手写线程池 starter**

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

---

**SpringBoot + Mybatis 单元测试案例**

项目地址：[java/testdemo](https://github.com/you170917/java/tree/main/java/testdemo)

大致流程：连接本地数据库，通过 mybatis 查询所有的 role。

controller 层接口如下：

```java
@RestController
public class TestController {

    @Autowired
    RoleService roleService;

    @GetMapping("/getRoles")
    public List<Role> getAllRole(){
       return roleService.getAllRole();
    }
}
```

省略 service、mapper、bean层代码，详情见：[java/testdemo](https://github.com/you170917/java/tree/main/java/testdemo)

单元测试代码如下：

```java
@SpringBootTest
class TestdemoApplicationTests {

    @Autowired
    RoleService roleService;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    TestController testController;

    @Test
    void test1(){
        List<Role> allRole = roleService.getAllRole();
        allRole.forEach(System.out::println);
    }
    @Test
    void test2(){
        List<Role> allRole = roleMapper.getAllRole();
        allRole.forEach(System.out::println);
    }
    @Test
    void test3(){
        List<Role> allRole = testController.getAllRole();
        allRole.forEach(System.out::println);
    }
}
```

## 2021年7月27日

**Mybatis-Plus demo**

项目地址：[ssm/mybatis-plus](https://github.com/you170917/java/tree/main/ssm/mybatis-plus)

学习 Mybatis-Plus，参照官网，写一个 demo。

官网地址：[https://baomidou.com/guide/quick-start.html](https://baomidou.com/guide/quick-start.html)

## 2021年7月22日

**手写简易 AOP**

项目地址：[Spring/aop](https://github.com/you170917/java/tree/main/Spring/aop)

基于 JVM 动态代理，手写简易 AOP，实现前置处理和后置处理。
