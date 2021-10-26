package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//把mapper扫进来，Application目前只能扫描controller，不能扫repository，因为它是mybatis管理的并没有交给spring
@MapperScan("com.repository")
//把spring提供的mapper扫到IoC中，注解会自动把实例化对象加入到IoC容器中，
// 后面controller中才能自动取出repositiry
public class Applicatiion {
    public static void main(String[] args) {
        SpringApplication.run(Applicatiion.class,args);
    }
}
