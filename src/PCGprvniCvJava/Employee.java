package PCGprvniCvJava;

class Employee extends Person
{
    public int salary;
    public Employee() { }
    public Employee(int vek, int plat)
      
    {
    	super(vek);
        salary = plat;
    }
    public void writeInfo()
    {
        System.out.print("počet osob:"+ Person.getCount() +", věk:"+  age);
        System.out.print(", salary: " + salary);
    }
}
