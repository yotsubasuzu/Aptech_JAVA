public class Client {
    public static void main(String[] args) {
		Student studentA;
		Student studentB;
		
		studentA=new Student(1,"Nguyen Van A",true);
		studentB=new Student(2,"Nguyen Van C",true);
        studentA.printInfo();

		studentB.printInfo();
		
		studentB.setName("Nguyen Van B");
		studentB.printInfo();
	}
}
