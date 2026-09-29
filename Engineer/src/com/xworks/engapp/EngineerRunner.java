package com.xworks.engapp;

import com.xworks.engapp.engg.Engineer;
import com.xworks.engapp.engg.aiml.AiMlEngineer;
import com.xworks.engapp.engg.civil.CivilEngineer;
import com.xworks.engapp.engg.cs.CsEngineer;
import com.xworks.engapp.engg.ec.EcEngineer;
import com.xworks.engapp.engg.eee.EeeEngineer;
import com.xworks.engapp.engg.is.IsEngineer;
import com.xworks.engapp.engg.mechanical.MechanicalEngineer;

public class EngineerRunner {

    public static void main(String[] args) {

        Engineer csEngineer = new CsEngineer();
        csEngineer.solveProblem();

        Engineer aimlEngineer = new AiMlEngineer();
        aimlEngineer.solveProblem();

        Engineer isEngineer = new IsEngineer();
        isEngineer.solveProblem();

        Engineer ecEngineer = new EcEngineer();
        ecEngineer.solveProblem();

        Engineer eeeEngineer = new EeeEngineer();
        eeeEngineer.solveProblem();

        Engineer civilEngineer = new CivilEngineer();
        civilEngineer.solveProblem();

        Engineer mechanicalEngineer = new MechanicalEngineer();
        mechanicalEngineer.solveProblem();
    }
}
