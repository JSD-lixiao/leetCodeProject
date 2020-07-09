package commonutils;

import io.github.ljwlgl.util.DateUtil;

import java.util.Date;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/30 15:03
 */
public class UtilTest {
    public static void main(String[] args) {
        System.out.println(DateUtil.dateToString(new Date(),"YYYY/MM/dd"));
    }
}
