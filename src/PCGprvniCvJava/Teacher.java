package PCGprvniCvJava;

class Teacher extends Employee
{
    public int teachingTime;
    public Teacher(int vek, int plat, int uvazek)
      
    {
    	super(vek, plat);
        teachingTime = uvazek;
    }
    public void writeInfo()
    {
        super.writeInfo();
        System.out.println(", počet úvazkových hodin: " + teachingTime);
    }
}
