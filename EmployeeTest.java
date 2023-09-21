public class EmployeeTest {

	public static void main(String[] args) {
		Employee weihao = new Employee("Weihao Qu", 50000);
		weihao.raiseSalary(10) ;
		System.out.print(weihao.getSalary()); // it prints 55000.


	}

}
