package modules.chain;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 9:59
 */
public class CommonManager extends Manager {
    public CommonManager(String name){
        super(name);
    }
    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && 2 >= request.getRequestNumber()){
            System.out.println(String.format("%s:%s 数量%s 被批准",this.name,request.getRequestContent(),request.getRequestNumber()));
        }else {
            if (this.superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
