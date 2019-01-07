/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */


public class MemberVariable
{
    public String memberName(String name)
    {
        Member obj =new Member();
        obj.setName(name);
        return obj.getName();
    }
    public int memberAge(int age)
    {
        Member obj =new Member();
        obj.setAge(age);
        return obj.getAge();
    }
    public String memberSalary(String salary)
    {
        Member obj =new Member();
        obj.setSalary(salary);
        return obj.getSalary();

    }

}
