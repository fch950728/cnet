package com.cnet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheEvict;

/**
 * 数链云贷主启动类
 * @author zodiac
 * @version 1.0
 *
 */
@SpringBootApplication
@MapperScan("com.cnet.mapper")
public class CnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnetApplication.class, args);
	}

}
