package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Challenge;
import academy.learnprogramming.kotlincode.Employee;
import academy.learnprogramming.kotlincode.KotlinCodeKt;

public class Main {

    public static void main(String[] args) {
        //Variant 1 that works with @Jvm* annotations in Kotlin
        /*KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");*/

        //Variant 2, without @Jvm* annotations in Kotlin
        KotlinCodeKt.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);

        employee.takesDefault("arg1", "default");

        //Part 3, IllegalArgumentException if null is passed to takesDefault parm1
        //For me it does not work as expected. Instead of IllegalArgumentException it throws NullPointerException
        employee.takesDefault(null, "default");

    }
}
