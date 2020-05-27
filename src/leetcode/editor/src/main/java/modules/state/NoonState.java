package modules.state;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:00
 */
public class NoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() <13){
            System.out.println(String.format("当前时间:%s点，饿了，午饭，犯困，午休！！", work.getHour()));
        }else{
            //todo 下午的状态
            System.out.println(String.format("当前时间:%s点，下午状态尚可，继续战斗！！", work.getHour()));

        }
    }
}
