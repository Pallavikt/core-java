package com.xworkz.builtinexception.checked;

public class ClassNotFoundEx {

    public static void main(String[] args) {
        try{
            Class.forName("com.xworkz.builtinexception.unchecked.Exceptions");
        }catch (ClassNotFoundException e){
            System.out.println("class is not found, provide the correct fully qualified Class as a String");
        }
    }
}
