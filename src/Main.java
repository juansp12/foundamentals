

public class Main {

	public static void main(String[] args) {
		Student Manolo = new Student("Manolo", "Cobos", 11120, 44, 4);
		Student Ericcson = new Student("Ericcson", "Rojas", 12420, 55, 7);
		Student Diego = new Student("Diego", "Sanchez", 84750, 70, 5);	
		Courses matematicas = new Courses("Matematicas", "Pr. Jirafales", 2024);
//		System.out.println(Pedro);
//		System.out.println(Ericcson.toString());
//		System.out.println(Ericcson.grade);
		Student[] studentsArray = { Ericcson, Diego, Manolo };
		matematicas.enroll(studentsArray);
		System.out.println("Estudiantes registrados: " + matematicas.countStudents());	
		System.out.println("-------------------------------------------------------------");
		System.out.println(Ericcson + (Ericcson.isApproved()?" Si Aprobaste,  ":" No Aprobaste, ") + "Tu año sera: " + Ericcson.changeYearIfApproved());
		System.out.println("-------------------------------------------------------------");
		System.out.println(Manolo + (Manolo.isApproved()?" Si Aprobaste, ":" No Aprobaste, ") + "Tu año sera: " + Manolo.changeYearIfApproved());
		System.out.println("-------------------------------------------------------------");
		System.out.println(Diego + (Diego.isApproved()?" Si Aprobaste, ":" No Aprobaste, ") + "Tu año sera: " + Diego.changeYearIfApproved());
		System.out.println("-------------------------------------------------------------");
		 
		 matematicas.printRanking();
		 matematicas.compareWithAverage();
	}//main
	
}//main
