package com.xworkz.builtinexception.checked;

import com.xworkz.builtinexception.unchecked.Exceptions;

import java.lang.reflect.Constructor;

public class ClassNotFound {

    public static void main(String[] args) {

        try {
           java.lang.Class<Exceptions> exceptionsClass = (Class<Exceptions>) Class.forName("com.xworkz.builtinexception.unchecked.Exceptions");
            for (Constructor constructor : exceptionsClass.getConstructors()){
              String s = constructor.getName();
                System.out.println(s);
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
