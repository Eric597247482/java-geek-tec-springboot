package com.example.yaml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YamlApplicationTests {

	@Autowired
	RedisCluster redisCluster;

	@Test
	void contextLoads() {
		System.out.println(redisCluster);
	}

}