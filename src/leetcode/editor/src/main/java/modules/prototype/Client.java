package modules.prototype;

/**
 * @author lixiao
 * @version 1.0
 * @description 原型模式客户端
 * @date 2020/4/28 14:51
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("jack");
        resume.setAge(20);
        resume.setWorkExperience("2019-01-01", "tecent");
        System.out.println("resume = " + resume);
        Resume resume1 = resume.clone();
        resume1.setName("tom");
        resume1.setAge(30);
        resume1.setWorkExperience("2020-01-20", "alibaba");
        System.out.println("resume1 = " + resume1);
    }
}
