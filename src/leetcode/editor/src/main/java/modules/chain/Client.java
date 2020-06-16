package modules.chain;

/**
 * 责任链模式
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 9:48
 */
public class Client {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request  = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setRequestNumber(7);
        commonManager.requestApplications(request);

        Request raseSalary = new Request();
        raseSalary.setRequestType("加薪");
        raseSalary.setRequestContent("小菜请求加薪");
        raseSalary.setRequestNumber(1000);
        commonManager.requestApplications(raseSalary);

    }
}
