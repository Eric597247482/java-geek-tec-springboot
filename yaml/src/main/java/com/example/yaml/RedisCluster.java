package com.example.yaml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Eric
 * @Date 2020/1/1 0001
 **/
@Data
@Component
@ConfigurationProperties("redis")
public class RedisCluster {
    private Integer port;
    private List<String> hosts;
    private List<Redis> redisList;
}
