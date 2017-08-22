package Object_Oriented_HackerRank_30DaysOfCode.Day19;//Write your code here

public class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n){
        int sum = 1;
        for (int i=2; i<=n; i++){
            if(n%i == 0)
                sum += i;
        }
        
        return sum;

    }
}
