package DesignPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         *
         * This can be resolved by checking in constructor if object already present or not
         * Using Enum
         *
         */

        reflectionBreak();
        serializationBreak();
    }

    private static void serializationBreak() {
    }

    public static void reflectionBreak() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException{
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton s2= constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}
