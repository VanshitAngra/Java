public class Excepton2nd {
    public static void main(String[] args) throws Exception {
        ExceptionHandling st=new ExceptionHandling();
        // st.age=12;
        // st.name="Ram";
        st.setAge(-2);
        System.out.println(st.getAge());
        // System.out.println(st.getName());
    }
}
