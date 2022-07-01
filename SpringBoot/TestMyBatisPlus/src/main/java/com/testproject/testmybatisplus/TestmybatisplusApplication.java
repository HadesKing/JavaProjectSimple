package com.testproject.testmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.testproject.testmybatisplus.infrastructure.repository")
/**
 * 开启事务管理 mybatis plus
 */
@EnableTransactionManagement
public class TestmybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestmybatisplusApplication.class, args);
	}

}
