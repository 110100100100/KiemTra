package Bai1;

public class Teacher extends People {


    //Thuộc tính: trình độ (level: ThS, TS), kinh nghiệm (experience), bộ môn (subject)
    public String level;
    public String experience;
    public String subject;

    //phương thức khởi tạo không tham số sử dụng super
    public Teacher(){
        super();
        this.level = "ThS";
        this.experience = "";
        this.subject = "OOP";

    }

    public Teacher(String name, int age, boolean sex, double height, double weight, String level, String experience, String subject){
        super(name, age, sex, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;

    }

    //getter/setter cho từng thuộc tính
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() + " Level: " + level + " Experience: " + experience + " Subject: " + subject;
    }
}
