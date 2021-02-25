package PCGprvniCvJava;

abstract class Person
{
    public int age;
    private static int count = 0;
    public Person() { count++; }
    public Person(int vek)
    {
        age = vek; count++;
    }
    abstract public void writeInfo();
    public  String toString()
    {                                      //
        return "ToString počet osob:" + Person.getCount() + ", věk:" + age;  
    }                                                                        
    public static int getCount()
    {
        return count;
    }
}
