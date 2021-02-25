package PCGprvniCvJava;

class Accountant extends Employee
{
    public Accountant(int vek, int plat)
     
    {
    	 super(vek, plat);
    }
    public  void writeInfo()
    {
        super.writeInfo();
        System.out.println();
    }
}