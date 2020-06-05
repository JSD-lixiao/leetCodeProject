package modules.bridge;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 10:12
 */
public class HandBrandN extends HandSetBrand{
    @Override
    public void run() {
        System.out.println("N品牌手机运行");
        handsetSoft.run();
    }
}
