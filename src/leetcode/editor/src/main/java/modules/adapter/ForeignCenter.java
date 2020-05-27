package modules.adapter;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:29
 */
@Data
public class ForeignCenter {

    private String name;
    public void jingong(){
        System.out.println(String.format("外籍中锋：%s,进攻",this.name));
    }
    public void fangshou(){
        System.out.println(String.format("外籍中锋：%s,防守",this.name));
    }
}
