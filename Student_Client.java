public class Student_Client {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        int ageA=12;

        st1.age=19;st1.name="Vanshit";st1.intro();
        st2.age=20;st2.name="Vaaneesh";st2.intro();
    }
    private static void swap(Student s1,Student s2,String name,int age,String nameA,int ageA)
    {
        s1=new Student();
        s1.name=s2.name;
        s2.age=s1.age;

        s1.name=name;
        s2.age=ageA;
        ageA=age;
        s2.name="_";
        nameA=s2.name;
        s1.name=nameA;


    }

}
