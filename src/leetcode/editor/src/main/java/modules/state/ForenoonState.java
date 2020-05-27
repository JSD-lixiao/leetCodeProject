package modules.state;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 15:58
 */
public class ForenoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<12){
            System.out.println(String.format("当前时间:%s点，上午工作，精神百倍！！", work.getHour()));
        }else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
