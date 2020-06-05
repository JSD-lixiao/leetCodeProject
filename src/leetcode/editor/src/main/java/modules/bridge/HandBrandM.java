package modules.bridge;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 10:13
 */
public class HandBrandM extends HandSetBrand{
    @Override
    public void run() {
        System.out.println("M品牌手机运行");
        handsetSoft.run();
    }
}
