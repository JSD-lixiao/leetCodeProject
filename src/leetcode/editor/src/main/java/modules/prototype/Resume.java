package modules.prototype;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/28 14:44
 */
public class Resume {
    private String name;
    private Integer age;
    private WorkExperience workExperience = new WorkExperience();


    public Resume() {
    }

    public Resume(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public Resume(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String company) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setCompany(company);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.setAge(this.age);
        resume.setName(this.name);
        WorkExperience workExperience = this.workExperience.clone();
        resume.setWorkExperience(workExperience.getWorkDate(), workExperience.getCompany());
        return resume;
    }


    public void display() {
        System.out.println(String.format("姓名:{},年龄:{},工作经历:{}", this.name, this.age, this.workExperience.toString()));
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }
}
