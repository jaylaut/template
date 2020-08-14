package com.jay.template;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by jay on 2020/8/14.
 */
public class JedisTest {

    @Test
    public void testString(){
        Jedis jedis = new Jedis("123.57.223.173",6379);
        jedis.set("key001","hello,redis");
        String result = jedis.get("key001");
        System.out.println(result);
        jedis.close();
    }

    @Test
    public void testList(){
        Jedis jedis = new Jedis("123.57.223.173",6379);
        jedis.lpush("key002","a","b","c");
        jedis.rpush("key002","e");
        List<String> result = jedis.lrange("key002",0,-1);
        for(String r : result){
            System.out.println(r);
        }
        System.out.println(jedis.llen("key002"));
        jedis.close();
    }
}
