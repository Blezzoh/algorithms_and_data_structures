package Object_Oriented_HackerRank_30DaysOfCode;

class ErrorPracticeReference {

    /**
     * try and catch are on a block statement that you already know might throw an error
     * you know this because the method header has a "throws"
     */
    public static void main(String[] args) {
        ErrorPracticeReference p = new ErrorPracticeReference();
        try{
            p.example();
        }
        catch(Exception e){
            System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
        }
    }
    
    /**
     * the "throws" statement is used on the method's declaration for an exception
     that the method might possibly throw
     * throws statement followed by the type of error the method will throw
     * the "throw" statememt is used to throw a "a user-defined exception"
     * throw statement inside the method followed by creation of a new Exception already
     mentioned(by the throws statement) in the method header
     */
    void example() throws Exception{
        throw new Exception("This exception will always be thrown.");
    }
}
