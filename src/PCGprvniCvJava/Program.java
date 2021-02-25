package PCGprvniCvJava;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(20, 1000);
        s1.writeInfo();
        System.out.println(s1);
        Accountant e1 = new Accountant(30, 12000);
        e1.writeInfo();
        Teacher u1 = new Teacher(40, 20000, 22);
        u1.writeInfo();
        System.out.println("počet osob: "+ Person.getCount()+", věk: "+ u1.age);
      
	}

}
