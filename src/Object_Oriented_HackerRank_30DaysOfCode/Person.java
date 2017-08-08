package Object_Oriented_HackerRank_30DaysOfCode;

// Day 4
public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else
            this.age = initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String msg;
        if (this.age < 13)
            msg = "You are young.";
        else if (this.age >= 13 && this.age < 18)
            msg = "You are a teenager.";
        else
            msg = "You are old.";

        System.out.println(msg);


    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }
}
