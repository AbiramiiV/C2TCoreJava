package day5.single;

public class Student extends citizen {
    private int rollNo;
    private String college;

    public Student() {

    }

    public Student(String name, long aadhaar, int rollNo, String college) {
        super(name, aadhaar);
        this.rollNo = rollNo;
        this.college = college;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", college=" + college + ", getName()=" + getName() + ", getAadhaar()="
                + getAadhaar() + "]";
    }
}