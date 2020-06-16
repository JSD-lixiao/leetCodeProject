package modules.state;

/**
 * 状态模式
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 14:59
 */
public class Client {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(15);
        work.writeProgram();
    }
}
