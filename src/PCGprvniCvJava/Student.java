package PCGprvniCvJava;

class Student extends Person
{
    public int scholarship;
    //public Student() { }
    public Student(int vek, int stipendium)
      
    {
    	super(vek);
        scholarship = stipendium;
    }
    public void writeInfo()
    {
        System.out.print("počet osob: "+ Person.getCount()+", věk: "+ age);
        System.out.println(", scholarship:" + scholarship);
    }
    public String toString()
    {                         //
                              //return base.ToString() + ", scholarship: " + scholarship; //
        return super.toString() + String.format(" scholarship. {0}", scholarship); //2
    }                                                           //
}
