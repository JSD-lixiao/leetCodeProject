package redis;

import com.connectionpool.ConnectionpoolApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/7/1 9:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConnectionpoolApplication.class)
public class RedisConnection {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTest() throws IntrospectionException, InvocationTargetException, IllegalAccessException, IOException {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        Map<String, String> propertyMap = new HashMap<String, String>();
        User user = new User();
        user.setId(1L);
        user.setUsername("admin");
        user.setPassword("123456");
        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(user.getClass()).getPropertyDescriptors();
        for (PropertyDescriptor pro : propertyDescriptors) {
            String propertyName = pro.getName();
            if (Objects.nonNull(propertyName) && !propertyName.equals("class")) {
                Method getter = pro.getReadMethod();
                if (Objects.nonNull(getter)) {
                    RedisBeanField monna = getter.getAnnotation(RedisBeanField.class);
                    if (Objects.nonNull(monna)) {
                        propertyMap.put(propertyName,String.valueOf(getter.invoke(user,null)));
                    }
                }
            }

        }
//        HashOperations<String, String, Object> hashOperations = redisTemplate.opsForHash();
//        hashOperations.putAll("user:"+user.getId()+":"+user.getUsername(), propertyMap);
//        System.out.println("hashOperations = " + hashOperations.get("user:"+user.getId()+":"+user.getUsername(),"password"));

    }




}
