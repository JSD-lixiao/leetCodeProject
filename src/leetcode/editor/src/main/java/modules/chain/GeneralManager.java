package modules.chain;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 10:03
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name){
        super(name);
    }
    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())){
            System.out.println(String.format("%s:%s 数量%s 被批准",this.name,request.getRequestContent(),request.getRequestNumber()));
        }else if ("加薪".equals(request.getRequestType()) && request.getRequestNumber() <= 500){
            System.out.println(String.format("%s:%s 数量%s 被批准",this.name,request.getRequestContent(),request.getRequestNumber()));
        }else if ("加薪".equals(request.getRequestType()) && request.getRequestNumber() > 500){
            System.out.println(String.format("%s:%s 数量%s 驳回",this.name,request.getRequestContent(),request.getRequestNumber()));

        }
    }
}
