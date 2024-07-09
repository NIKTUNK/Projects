import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable <Employee>
{
    private String name;

    @Override
    public int compareTo(Employee o) {
        int res;
        res = this.getSalary().compareTo(o.getSalary());
        if (res == 0)
            res = this.getName().compareTo(o.getName());
        return res;
    }

    private Integer salary;
    private Date workStart;

    public Employee(String name, Integer salary, Date workStart)
    {
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public String toString()
    {
        return name + " - " + salary + " - " +
                (new SimpleDateFormat("dd.MM.yyyy")).format(workStart);
    }
}
