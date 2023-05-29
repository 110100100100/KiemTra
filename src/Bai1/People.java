package Bai1;

public class People {
    //tên (name), tuổi (age), giới tính (sex), chiều cao (height), cân nặng (weight)
    public   String name;
    public   int age;
    public boolean sex;
    public   double height;
    public double weight;


    //phương thức khởi tạo không tham số
    public People() {
        this.name = "A";
        this.age = 0;
        this.sex = true;
        this.height = 0.0;
        this.weight = 0.0;
    }


    //phương thức khởi tạo đầy đủ tham số
    public People(String name, int age, boolean sex, double height, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }


    //getter/setter cho từng thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //phương thức toString trả về thông tin people
    @Override
    public String toString() {
        return "People: " + "Name: " + name +" Age: "+ age+" Sex: "+ sex+ " Height: "+ height+ " Weight: "+ weight;
    }
}