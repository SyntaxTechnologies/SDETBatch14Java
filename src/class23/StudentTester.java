package class23;

public class StudentTester {
    public static void main(String[] args) {
        Student[] arr={new CollegeStudent(),
        new SchoolStudent(),new SyntaxStudent()};

        for (Student st:arr
             ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
