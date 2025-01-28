package Singleton;

public class Singleton {

    //define the instance
    private static Singleton instance;

    //private constructor
    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
             instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton Instance " + instance.hashCode());
    }

}
