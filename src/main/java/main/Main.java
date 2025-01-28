package main;

import Singleton.Singleton;
import factory.Shape;
import factory.ShapeFactory;
import observer.ConcreteObserver;
import observer.Observer;
import observer.Subject;

public class Main {
    public static void main(String[] args) {

        //Testing Singleton Pattern
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.showMessage();
        instance2.showMessage();

        System.out.println("Same instances: " + (instance1 == instance2));


        //Testing Factory Pattern
        ShapeFactory factory = new ShapeFactory();


        Shape circle = factory.getShape("CIRCLE");  //create objects without specifying their exact classes
        circle.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();

        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State 1");
        subject.setState("State 2");

    }
}
