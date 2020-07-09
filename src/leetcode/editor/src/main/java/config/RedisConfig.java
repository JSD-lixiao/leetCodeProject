package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/7/1 14:25
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisClusterConfiguration redisClusterConfiguration(){
        RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
        Set<RedisNode> redisNodes = new HashSet<>();
        redisClusterConfiguration.setClusterNodes(redisNodes);
        return redisClusterConfiguration;
    }
}
