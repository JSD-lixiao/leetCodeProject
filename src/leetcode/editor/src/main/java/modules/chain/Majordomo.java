package modules.chain;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 10:02
 */
public class Majordomo extends Manager{
    public Majordomo(String name){
        super(name);
    }
    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && 5 >= request.getRequestNumber()){
            System.out.println(String.format("%s:%s 数量%s 被批准",this.name,request.getRequestContent(),request.getRequestNumber()));
        }else {
            if (this.superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
