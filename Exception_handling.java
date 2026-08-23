/*

class Exception_Handling{
    public static void main(String[] args){
        System.out.println("A sample program for Exception Handling.");
        
        try{
            System.out.println(10/5);
        } catch(ArithmeticException e){
            System.out.println("New Exception.");
        } finally{
            System.out.println("Finally the exception caught and code runs smoothly.");
        }
    }
} 


public class Explicit_Exception{
    public static void main(String[] args){
        int a = 10;
        try{
           divide(a);
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally{
            System.out.println("OK! Done.");
        }
    }
    
    static int divide(int a)throws ArithmeticException{
        return a/0;
    }
}
*/

public class Explicit_Exception2{
    public static void main(String[] args){
       try{
           validateAge(15);
       }catch(Exception e){
           System.out.println("Exception caught: "+ e.getMessage());
       }
    }
    
    public static void validateAge(int age){
        if(age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}


class InvalidAge extends Exception{
    public InvalidAge(String msg){
        super(msg);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 12;
        CheckAge(age);
    }
    public void ChecAge(int age){
        if(age < 18){
            throw new InvalidAge("Your age is Invalid.");
        }
        System.out.println("Your age is valid.");
    }
}
 


