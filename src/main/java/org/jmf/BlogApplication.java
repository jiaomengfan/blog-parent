package org.jmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName BlogApplication
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/14 13:07
 * @Version 1.0
 **/
@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class,args);
    }
}
