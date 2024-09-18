
public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       public Student (String firstName, String lastName,int registration, int grade, int year) {
	    	   this.firstName = firstName;
	           this.lastName = lastName;
	           this.registration = registration;
	           this.grade = grade;
	           this.year = year;
	   	}//constructor
	       
	      
	       public Student(String firstName, int grade, int year) {
	           this(firstName, "Rojas", 12420, 55, 7); // Llama al constructor principal
	       }//constructor

	       public Student(String lastName) {
	           this("Manolo", lastName, 11120, 44, 4); // Llama al constructor principal
	       }//constructor
	       
	       public void printFullName(){
	    	      System.out.println(firstName + " " + lastName);
	    	   }//printFullName

	    	   public boolean isApproved(){
	    	      return grade>=60;
	    		   //TODO implement: should return true if grade >= 60
	    	   }//isApproved

	    	   public int changeYearIfApproved(){
	    	       if(grade >= 60) {
	    	    	   year = year + 1;
	    	    	   System.out.println("Congragulations");
	    	    	   
	    	       }
	    		   //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
	    	       return year;
	    	   }//changeYearIfApproved
	    		
	    		public String toString(){
	    			return "Nombre= " + this.firstName + " " + this.lastName +  ", year=" + this.year + " , registration=" + this.registration
	    					+ ", grade=" + this.grade;
	    		}
}//class student
