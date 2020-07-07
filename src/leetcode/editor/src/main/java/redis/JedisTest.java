package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/7/1 10:47
 */
public class JedisTest {
    public static void main(String[] args) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        JedisShardInfo jedisShardInfo = new JedisShardInfo("127.0.0.1",6379);
        Jedis jedis = new Jedis(jedisShardInfo);
        User user = new User();
        user.setId(1L);
        user.setUsername("admin");
        user.setPassword("123456");
        try(
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            ){
            objectOutputStream.writeObject(user);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            String key = String.valueOf(user.getId());
            jedis.set(key.getBytes(),bytes);
           try(ByteArrayInputStream  byteArrayInputStream = new ByteArrayInputStream(jedis.get(key.getBytes()));
               ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
           ){
               System.out.println(objectInputStream.readObject());
           }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
