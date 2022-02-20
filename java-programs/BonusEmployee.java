package training_java;
import java.util.*;

public class BonusEmployee {
	static int year, salary, newsalary;
	static double bonus;

	static double Employeebonus() {
		double res = (int) (salary * .05);
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your year of service");
		year = scanner.nextInt();
		System.out.println("Enter your salary");
		salary = scanner.nextInt();
		if (year > 5) {
			bonus = Employeebonus();
			System.out.println("your bonus amount is " + bonus);
			System.out.println("your salary is" + (salary + bonus));

		} else {
			System.out.println("you are not eligible for bonus salary is " + salary);
		}
	}
}
