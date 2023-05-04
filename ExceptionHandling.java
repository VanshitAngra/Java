public class ExceptionHandling {
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age) throws Exception
    {
        if(age<0)
        {
            throw new Exception("Age can't be negative ");
        }
        else
        this.age=age;
     ` // }
    }
    public String getName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public static void main(String[] args) {
    }
}
