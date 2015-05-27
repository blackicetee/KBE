package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String typ="double";
        Counter ci = CounterFactory.getCounterInstance(typ);
        ci.increment();
        System.out.println(ci.getCounter());
    }
}
