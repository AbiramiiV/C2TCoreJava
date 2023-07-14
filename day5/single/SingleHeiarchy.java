package day5.single;

public class SingleHeiarchy {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Imran");
        st.setRollNo(10);
        st.setCollege("MSAJCE");
        st.setAadhaar(1234567891);
        
        System.out.println(st);
    }
}