package Object_Oriented_HackerRank_30DaysOfCode;

class Person2 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person2(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person2{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firtName, String lastName, int id, int [] scores){
        super(firtName, lastName, id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *  @param scores: array representing the grades
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        
        int sum = 0;
        for( int i =0; i<this.testScores.length; i++){
            sum += this.testScores[i];
        }
        int average = sum/(this.testScores.length);
        if( average >= 90 && average <= 100)
           return 'O';
        else if( average >= 80 && average < 90)
            return 'E';
        else if( average >= 70 && average < 80)
            return 'A';
        else if( average >= 55 && average < 70)
            return 'P';
        else if( average >= 40 && average < 55)
            return 'D';
        else 
            return 'T';
    }
}
