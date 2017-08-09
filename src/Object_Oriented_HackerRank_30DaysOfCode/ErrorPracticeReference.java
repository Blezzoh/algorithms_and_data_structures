class ErrorPracticeReference {

    /**
     * throws statement followed by the type of error the method will throw
     * throw statement inside the method followed by creation of a new Exception already 
     mentioned(by the throws statement) in the method header
     */
    void example() throws Exception{
        throw new Exception("This exception will always be thrown.");
    }
    
    public static void main(String[] args) {
        PropagatedException p = new PropagatedException();
        try{
            p.example();
        }
        catch(Exception e){
            System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
        }
    }
}
