package modules.bridge;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 9:55
 */
public class Client {
    public static void main(String[] args) {
        HandSetBrand ab = new HandBrandN();
        ab.setHandsetSoft(new HandSetGame());
        ab.run();
        ab.setHandsetSoft(new HandSetAddressList());
        ab.run();
        ab = new HandBrandM();
        ab.setHandsetSoft(new HandSetGame());
        ab.run();
        ab.setHandsetSoft(new HandSetAddressList());
        ab.run();
    }
}
