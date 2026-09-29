package com.xworkz.eng.engineer.cs;

import com.xworkz.eng.engineer.Engineer;

public class CsEngineer extends Engineer {

    public CsEngineer(){
        super();
        System.out.println("Cs Engineer cons invoked");
    }

    public CsEngineer(int i){
        super(i);
        System.out.println("Cs Engineer with int param invoked");
    }

    public void developSoftware(){
        System.out.println("Developing a Software");
    }
}
