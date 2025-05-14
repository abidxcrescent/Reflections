import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        /*
            There are 3 ways to create reflection of java class.

            1. Class birdClass = Class.forName("Bird")

            2. Class birdClass = Bird.class;

            3. Bird birdObj = new Bird();
               Class birdClass = birdObj.getClass()

         */

        /*
            In Java for every class after compilation JVM internally create
            a class which has a name Class. Every single class will have it.
            This Class contains metadata of:
                a. class
                b. methods
                c. variables
                d. interfaces
                e. constructor

         */

        /*
            Apart from knowing metadata reflection has practical uses like
                a. accessing private fields, methods
         */

        Class birdClass;
        try {
            birdClass = Class.forName("Bird");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(birdClass);

        /*
        public void swim(Integer input, boolean swim, String input2){
            System.out.println("Can swim");
        }
         */

        /*
            The following is required to invoke a method of any class using reflection strategy.

         */


        Object birdObj = birdClass.newInstance();

        Method swimMethod = birdClass.getMethod("swim", Integer.class, boolean.class, String.class);

        swimMethod.invoke(birdObj,25,false,"Hello");


    }

}























