# java
在 java 开发的学习和实践中，撸的各种轮子。

## 2021年8月9日

**mybatis_annotations_develop**

项目地址：[mybatis_annotations_develop](https://github.com/you170917/java/tree/main/mybatis_annotations_develop)

熟悉注解 @Insert、@Update、 @Delete、@Select 的使用。

参考文章：[https://blog.csdn.net/weixin_43883917/article/details/113830667](https://blog.csdn.net/weixin_43883917/article/details/113830667)

## 2021年8月3日

**Mybatis-Plus demo**

项目地址：[mybatis-plus](https://github.com/you170917/java/tree/main/mybatis-plus)

熟悉对 mybatis-plus 的应用，尤其是 `BaseMapper`、`QueryWrapper`、`UpdateWrapper`的用法，具体参考文章：[MyBatis-Plus 条件构造器 Wrapper 的用法](https://www.cnblogs.com/youcoding/p/15094467.html)

使用 mybatis-plus 报错 `SQLSyntaxErrorException: Unknown column 'xxx' in 'field list'` 的话，参考文章 [https://www.cnblogs.com/youcoding/p/15094249.html](https://www.cnblogs.com/youcoding/p/15094249.html)

## 2021年8月2日

**SpringBoot + Cache + Redis 缓存demo**

项目地址：[cachedemo](https://github.com/you170917/java/tree/main/cachedemo)

对于 SpringBoot cache，主要是在启动类上添加注解`@EnableCaching`开启缓存，并在需要使用缓存的方法上，使用注解`@Cacheable`:

```java
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Cacheable(cacheNames = "users")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
```

在需要加缓存的方法上添加注解 `@Cacheable(cacheNames = "xxx", key = "xxx")`,

`cacheNames` 和 `key` 都必须填，如果不填 `key` ，默认的 `key` 是当前的方法名。

对于 Redis ，主要使用 `StringRedisTemplate` 和 `RedisTemplate`

两者的区别，参考文章：[https://www.cnblogs.com/JiangLai/p/9999811.html](https://www.cnblogs.com/JiangLai/p/9999811.html)

## 2021年8月2日

**SpringBoot+mybatis 切换多数据源**

项目地址：[SwitchingMultipleDatasources](https://github.com/you170917/java/tree/main/SwitchingMultipleDatasources)

注意：Springboot2.0 在配置多数据源连接的时候需要使用 `jdbc-url`，如果只使用 url 的话会报
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

项目地址：[threadpool](https://github.com/you170917/java/tree/main/threadpool)

新建了一个 Maven 空工程，在其中建两个 SpringBoot 子工程：

- threadpool-spring-boot-starter
- demo

其中，[threadpool-spring-boot-starter](https://github.com/you170917/java/tree/main/threadpool/threadpool-spring-boot-starter) 就是一个简易的线程池。

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

项目地址：[testdemo](https://github.com/you170917/java/tree/main/testdemo)

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

省略 service、mapper、bean层代码，详情见：[testdemo](https://github.com/you170917/java/tree/main/testdemo)

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

项目地址：[mybatis-plus](https://github.com/you170917/java/tree/main/mybatis-plus)

学习 Mybatis-Plus，参照官网，写一个 demo。

官网地址：[https://baomidou.com/guide/quick-start.html](https://baomidou.com/guide/quick-start.html)

## 2021年7月22日

**手写简易 AOP**

项目地址：[aop](https://github.com/you170917/java/tree/main/aop)

基于 JVM 动态代理，手写简易 AOP，实现前置处理和后置处理。
