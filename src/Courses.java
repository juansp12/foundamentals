import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year;
	List<Student> enrolledStudents;
	
	public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>(); 
    }
	
	 public void enroll(Student students) {
	        enrolledStudents.add(students); 
	    }
	 
	 public void enroll(Student[] students) {
	        for (Student student : students) {
	            enrolledStudents.add(student);
	            System.out.println(student.firstName + " " + student.lastName + " agregados.");
	        }
	    }
	 
	 public void unEnroll(Student student) {
	        if (enrolledStudents.contains(student)) {
	            enrolledStudents.remove(student); 
	        }
	    }
	 public int countStudents() {
	        return enrolledStudents.size(); // Devolvemos el tamaño de la lista
	    }
	 public int bestGrade() {
	        int bestGrade = 0;
	        for (Student student : enrolledStudents) {
	            if (student.grade > bestGrade) {
	                bestGrade = student.grade;
	            }
	        }
	        return 0; // Devolvemos la mejor calificación encontrada
	    }
	 public double averageGrade() {
	        if (enrolledStudents.isEmpty()) {
	            return 0.0; 
	        }
	        
	        int totalGrades = 0;
	        for (Student student : enrolledStudents) {
	            totalGrades += student.grade;
	        }
	        return totalGrades / (double) enrolledStudents.size();
	    }//averageGrade
	 public void printRanking() {
		  System.out.println("Promedio de los estudiantes del curso: " + courseName + ":");
	        for (Student student : enrolledStudents) {
	            System.out.println(student.firstName + " " + student.lastName + ": " + student.grade);
	        }
	 }//printRanking
	 public void compareWithAverage() {
	        double average = averageGrade();
	        System.out.println("El promedio del curso es: " + average);
	        
	        for (Student student : enrolledStudents) {
	            if (student.grade > average) {
	                System.out.println(student.firstName + " " + student.lastName + " esta por debajo del promedio");
	            } else if (student.grade < average) {
	                System.out.println(student.firstName + " " + student.lastName + " esta por encima del promedio");
	            } else {
	                System.out.println(student.firstName + " " + student.lastName + " es exactamente el promedio");
	            }
	        }
	    }//comareWithAverage
	

}//Courses
