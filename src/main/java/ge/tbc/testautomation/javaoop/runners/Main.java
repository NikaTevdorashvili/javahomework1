package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random=new Random();

        Circle circle1 = new Circle(random.nextInt(100)+1);
        System.out.println("Number of circle instances is "+Circle.numberOfCircleInstances);
        Circle circle2 = new Circle(random.nextInt(100)+1);
        System.out.println("Number of circle instances is "+Circle.numberOfCircleInstances);
        Circle circle3 = new Circle(random.nextInt(100)+1);
        System.out.println("Number of circle instances is "+Circle.numberOfCircleInstances);
        Circle circle4 = new Circle(random.nextInt(100)+1);
        System.out.println("Number of circle instances is "+Circle.numberOfCircleInstances);
        Circle circle5 = new Circle(random.nextInt(100)+1);
        System.out.println("Number of circle instances is "+Circle.numberOfCircleInstances);

        String circle1String= Util.circleToString(circle1);
        System.out.println(circle1String);
        String circle2String= Util.circleToString(circle2);
        System.out.println(circle2String);
        String circle3String= Util.circleToString(circle3);
        System.out.println(circle3String);
        String circle4String= Util.circleToString(circle4);
        System.out.println(circle4String);
        String circle5String= Util.circleToString(circle5);
        System.out.println(circle5String);






    }
}
