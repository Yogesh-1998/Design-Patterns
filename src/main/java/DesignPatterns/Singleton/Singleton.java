package DesignPatterns.Singleton;

public class Singleton {
    private static Singleton s ;

    private Singleton(){
        if (s!=null)
            new RuntimeException("Trying to break singleton using reflection");  // Breaking code using Reflection
    }

    public static Singleton getInstance(){
        if (s != null ) return s;
        return s= new Singleton();

    }
}

// To save breaking singleton from Reflection
//public enum Singleton{
//    INSTANCE;
//}

// Ways to break
// Reflection API
// Cloning
//

