package modules.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 9:01
 */
public class Product {
    private List<String> content = new ArrayList<>();

    public void addPart(String part){
        content.add(part);
    }
    public void show(){
        for (String part:content){
            System.out.println("part = " + part);
        }
    }

}
