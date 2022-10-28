package encapsulation26;

public class Encapsulate {

    private String name;
    private int rollNo;
    private int age;

    public String  getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getAge() {
        return age;
    }
    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }
}
