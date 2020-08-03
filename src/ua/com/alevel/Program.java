package ua.com.alevel;

public class Program {
    private int NUMBER = 982315679;

    public Program() {
        System.out.println(NUMBER);
        BreakingInt breakingInt = new BreakingInt();
        FizzBazz fizzBazz = new FizzBazz();
        fizzBazz.fizzBazz(breakingInt.breakingUpInt(NUMBER));

    }

}
