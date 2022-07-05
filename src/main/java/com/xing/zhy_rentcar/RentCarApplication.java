package com.xing.zhy_rentcar;
/*
 * @Author Xing
 * @Date 14:38 2022/7/5
 * @Description
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xing.zhy_rentcar") //扫描Mapper接口所在的包
@SpringBootApplication
public class RentCarApplication {

    public static void main(String[] args) {
        //主程序开始执行
        SpringApplication.run(RentCarApplication.class, args);
    }
}
