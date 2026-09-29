package com.xworkz.eng;

import com.xworkz.eng.engineer.Engineer;
import com.xworkz.eng.engineer.cs.CsEngineer;

public class EngineerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Engineer eng = new Engineer();

        Engineer eng1 = new Engineer(7);

        CsEngineer cs = new CsEngineer();

        CsEngineer cs1 = new CsEngineer(7);

        Engineer engineer = new CsEngineer(); //upcasting
        engineer.solveProblem();

        CsEngineer csEngineer = (CsEngineer) engineer; //down casting - is done only after upcasting
        csEngineer.developSoftware();

        int i = 80;
        byte i1 = (byte) i;
    }
}
