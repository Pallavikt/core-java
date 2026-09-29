package com.xworkz.eng.engineer;

public class Engineer {

    public Engineer(){
        System.out.println("Engineer cons invoked");
    }

    public Engineer(int i){
        System.out.println("Engineer cons with int param invoked");
    }

    public void solveProblem(){
        System.out.println("solving problem");
    }
}
