package com.xworkz.customexception.hospital;

import com.xworkz.customexception.checkedexception.*;

public class HospitalImpl implements Hospital{

    private int index;
    private Doctor[] doctors;

    public HospitalImpl(int size){
        this.doctors = new Doctor[size];
    }

    public boolean addDoctor(Doctor doctor){
        boolean isAdded = false;

        boolean isDoctorIdValid = false;
        boolean isDoctorNameValid = false;
        boolean isDesignationValid = false;
        boolean isSpecializationValid = false;
        boolean isExperienceValid = false;
        boolean isfeesValid = false;

        int doctorId = doctor.id;
        if (doctorId > 0) {
            isDoctorIdValid = true;
        } else {
            System.out.println("Doctor Id is Invalid");
        }

        String doctorName = doctor.doctorName;
        if (doctorName != null && !doctorName.isEmpty()) {
            isDoctorNameValid = true;
        } else {
            System.out.println("Doctor Name is Invalid");
        }

        String designation = doctor.designation;
        if (designation != null && !designation.isEmpty()) {
            isDesignationValid = true;
        }else System.out.println("Doctor Designation is Invalid!");

        String[] specialization = doctor.specialization;
        if (specialization != null) {
            isSpecializationValid = true;
        }else System.out.println("Doctor Specialization is Invalid!");

        String experience = doctor.experience;
        if (experience != null && !experience.isEmpty()) {
            isExperienceValid = true;
        }else System.out.println("Doctor Experience is Invalid!");

        int fees = doctor.fee;
        if (fees > 0) {
            isfeesValid = true;
        }else System.out.println("Doctor Fees is Invalid!");

        if (isDoctorIdValid && isDoctorNameValid && isDesignationValid && isSpecializationValid
                && isExperienceValid && isfeesValid) {
            if (index < doctors.length) {
                doctors[index++] = doctor;
                isAdded = true;
                System.out.println("Doctor added..");
            } else {
                System.out.println("Hospital database is full! Cannot add more doctors.");
            }
        }

        return isAdded;
    }

    @Override
    public int getFeeByDoctorName(String name) throws FeeNotFoundException{
        int fee = 0;
        for (Doctor doctor: doctors){
            if (name.equals(doctor.getDoctorName())){
                fee = doctor.fee;
            }
        }
        if (fee==0){
            FeeNotFoundException exception = new FeeNotFoundException("Sorry.. Fee not found!");
            throw exception;
        }
        return fee;
    }

    @Override
    public int getFeeById(int id) {
        int fee = 0;
        try {
            for (Doctor doctor : doctors) {
                if (id == doctor.id) {
                    fee = doctor.fee;
                }
            }
            if (fee == 0) {
                FeeNotFoundException exception = new FeeNotFoundException("Sorry.. Fee not found!");
                throw exception;
            }
        }catch (FeeNotFoundException e){
            e.printStackTrace();
        }
        return fee;
    }

    @Override
    public String[] getSpecializationByDoctorName(String name) throws SpecializationNotFoundException{
       String[] specialization = null;
       for (Doctor doctor:doctors){
           if (name.equals(doctor.getDoctorName())){
               specialization = doctor.getSpecialization();
           }
       }
       if (specialization == null){
           SpecializationNotFoundException exception = new SpecializationNotFoundException("Sorry.. Specializations not available!");
           throw exception;
       }
       return specialization;
    }

    @Override
    public String getDesignationById(int id) {
        String designation = null;
        try {
            for (Doctor doctor : doctors) {
                if (id == doctor.getId()) {
                    designation = doctor.getDesignation();
                }
            }
            if (designation == null) {
                DesignationNotFoundException exception = new DesignationNotFoundException("Sorry.. Designation not found");
                throw exception;
            }
        }catch (DesignationNotFoundException e){
            e.printStackTrace();
        }
        return designation;
    }

    @Override
    public String getDesignationByName(String name) {
        String designation = null;
        try{
        for (Doctor doctor: doctors) {
            if (name.equals(doctor.doctorName)) {
                designation = doctor.designation;
            }
        }
        if (designation == null) {
            DesignationNotFoundException exception = new DesignationNotFoundException("Sorry.. Designation not found");
            throw exception;
        }
    }catch (DesignationNotFoundException e){
        e.printStackTrace();
    }
        return designation;
    }

    @Override
    public String getExperienceByDoctorName(String name) {
        String experience = null;
        try {
            for (Doctor doctor : doctors) {
                if (name.equals(doctor.doctorName)) {
                    experience = doctor.experience;
                }
            }
            if (experience == null) {
                ExperienceNotFoundException exception = new ExperienceNotFoundException("Sorry.. experience not found");
                throw exception;
            }
        }catch (ExperienceNotFoundException e){
            e.printStackTrace();
        }
        return experience;
    }

    @Override
    public String getExperienceById(int id) {
        String experience = null;
        try{
            for (Doctor doctor:doctors){
            if (id==doctor.getId()){
                experience = doctor.experience;
            }
        }
        if (experience == null) {
            ExperienceNotFoundException exception = new ExperienceNotFoundException("Sorry.. experience not found");
            throw exception;
        }
    }catch (ExperienceNotFoundException e){
        e.printStackTrace();
    }
        return experience;
    }

    @Override
    public Doctor getDoctorById(int id) {
        Doctor doctor = null;
        try {
            for (Doctor doctor1 : doctors) {
                if (id == doctor1.id) {
                    doctor = doctor1;
                }
            }
            if (doctor == null) {
                DoctorNotFoundException exception = new DoctorNotFoundException("Sorry.. doctor not found");
                throw exception;
            }
        }catch (DoctorNotFoundException e){
            e.printStackTrace();
        }
        return doctor;
    }

    @Override
    public Doctor getDoctorByFee(int fee) {
        Doctor doctor = null;
        try{
            for (Doctor doctor1:doctors){
            if (fee == doctor1.getFee()){
               doctor = doctor1;
            }
        }
        if (doctor == null) {
            DoctorNotFoundException exception = new DoctorNotFoundException("Sorry.. doctor not found");
            throw exception;
        }
    }catch (DoctorNotFoundException e){
        e.printStackTrace();
    }
       return doctor;
    }

    @Override
    public Doctor getDoctorByExperience(String experience) {
        Doctor doctor = null;
        try{
            for (Doctor doctor1:doctors){
            if (experience.equals(doctor1.experience)){
                doctor = doctor1;
            }
        }
        if (doctor == null) {
            DoctorNotFoundException exception = new DoctorNotFoundException("Sorry.. doctor not found");
            throw exception;
        }
    }catch (DoctorNotFoundException e){
        e.printStackTrace();
    }
        return doctor;
    }

    @Override
    public Doctor getDoctorByDesignation(String designation) {
        Doctor doctor = null;
        try{
            for (Doctor doctor1: doctors){
            if (designation.equals(doctor1.designation)){
                doctor = doctor1;
            }
        }
        if (doctor == null) {
            DoctorNotFoundException exception = new DoctorNotFoundException("Sorry.. doctor not found");
            throw exception;
        }
    }catch (DoctorNotFoundException e){
        e.printStackTrace();
    }
        return doctor;
    }

    @Override
    public boolean updateFeeByExperience(int newFee, String experience) {
        boolean isUpdated = false;
        for (Doctor doctor:doctors){
            if (experience.equals(doctor.getExperience())){
               doctor.setFee(newFee);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public void getAllDoctors() {
        for (Doctor doctor: doctors){
            if (doctor != null) {
                System.out.println(doctor);
            }
        }
    }
}
