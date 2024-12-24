package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.exception.*;
import com.xworkz.instituteapp.trainee.Trainee;

import javax.naming.Name;
import java.util.Arrays;

import static java.lang.Math.pow;

public class Institute implements Template{

    Trainee trainees[] = null;
    int index;

    public Institute(int size) {
        trainees= new Trainee[size];
    }

    public boolean addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;
        if (trainee != null) {
            if (index < trainees.length) {
                if (trainee.getId() > 0 && trainee.getName() != null && trainee.getDob() != null && trainee.getEmail() != null && trainee.getGender() != null && (trainee.getPhoneNumber() > pow(10, 9) && trainee.getPhoneNumber() < pow(10, 10)) && (trainee.getYearOfGraduation() > 2019 && trainee.getYearOfGraduation() < 2025) && trainee.getDegreeName()!=null) {
                    trainees[index++] = trainee;
                    isTraineeAdded = true;
                } else {
                    System.out.println("Fields are incorrect");
                }
            } else {
                System.out.println("Memory is full");
            }
        } else {
            System.out.println("Trainee fields are empty");
        }
        return isTraineeAdded;
    }

    public void getAllTraineeDetails() {
        int count = 0;
        for (Trainee trainee : trainees) {
            if (trainee != null) {
                count++;
                System.out.println("Trainee details are: ");
                System.out.println("-----------------");
                System.out.println(trainee);
            }
        }
        if (count < trainees.length) {
//            System.out.println(count);
//            System.out.println(trainees.length);
            System.out.println(trainees.length - count + " more trainees can be added");
            System.out.println("--------o---------------o--------------");
        }
    }

    public void details(Trainee trainee) {
        System.out.println("Trainee details are: ");
        System.out.println("-----------------");
        System.out.println("Trainee id: " + trainee.getId());
        System.out.println("Trainee name: " + trainee.getName());
        System.out.println("Trainee dob: " + trainee.getDob());
        System.out.println("Trainee gender: " + trainee.getGender());
        System.out.println("Trainee year of graduation: " + trainee.getYearOfGraduation());
        System.out.println("Trainee phone number: " + trainee.getPhoneNumber());
        System.out.println("Trainee email: " + trainee.getEmail());
        System.out.println("Is Trainee placed: " + trainee.isPlaced());
        System.out.println("--------o---------------o--------------");
    }

    public String getNameById(int id) {
        String name = null;
        try {
            for (Trainee trainee : trainees) {
                //  System.out.println("for loop");
                if (trainee.getId() == id) {
                    // System.out.println("if condition");
                    name = trainee.getName();
                    break;
                }
            }
            if (name == null)
            {
                NameNotFoundByIdException nameNotFoundByIdException=new NameNotFoundByIdException("Mentioned id "+id+" is not found");
                throw nameNotFoundByIdException;
            }
        }catch (NameNotFoundByIdException e){
            e.printStackTrace();
        }
        return name;
    }

    public Gender getGenderByName(String name) {
        Gender gender=null;
        try {
            for (Trainee trainee : trainees) {
                if (trainee.getName().equals(name)) {
                    gender = trainee.getGender();
                    break;
                }
            }
            if (gender == null) {
                GenderNotFoundByNameException genderNotFoundByNameException=new GenderNotFoundByNameException("Mentioned name "+name+" is not found");
                throw genderNotFoundByNameException;
            }
        }catch (GenderNotFoundByNameException e){
            e.printStackTrace();
        }
        return gender;
    }

  public String getNameByGender(Gender gender) {
        String name=null;
        try {
            for (Trainee trainee : trainees) {
                if (trainee.getGender().equals(gender)) {
                    name = trainee.getName();
                    break;
                }
            }
            if (name == null)
            {
                NameNotFoundByGenderException nameNotFoundByGenderException=new NameNotFoundByGenderException("Mentioned gender "+gender+" is not found");
                throw nameNotFoundByGenderException;
            }
        }catch (NameNotFoundByGenderException e){
            e.printStackTrace();
        }
        return name;
    }

      public long getPhoneNumberByName(String name) {
          long phoneNumber=0;
          try {
              for (Trainee trainee : trainees) {
                  if (trainee.getName().equals(name)) {
                      phoneNumber = trainee.getPhoneNumber();
                      break;
                  }
              }
              if (phoneNumber == 0) {
               PhoneNumberNotFoundByNameException phoneNumberNotFoundByNameException=new PhoneNumberNotFoundByNameException("Mentioned name "+name+" is not found");
               throw phoneNumberNotFoundByNameException;
              }
          }catch (PhoneNumberNotFoundByNameException e){
              e.printStackTrace();
          }
          return phoneNumber;
    }

    public String getEmailByName(String name) {
        String email=null;
        try {
            for (Trainee trainee : trainees) {
                if (trainee.getName().equals(name)) {
                    email = trainee.getEmail();
                    break;
                }
            }
            if (email == null)

            {
                EmailNotFoundByNameException emailNotFoundByNameException=new EmailNotFoundByNameException("Mentioned name "+name+" is not found");
                throw emailNotFoundByNameException;
            }
        }catch (EmailNotFoundByNameException e){
            e.printStackTrace();
        }
        return email;
    }

    public String getEmailById(int id) {
     String email = null;
     try {
         for (Trainee trainee : trainees) {
             if (trainee.getId() == id) {
                 email = trainee.getEmail();
                 break;
             }
         }
         if (email == null) {
          EmailNotFoundByIdException emailNotFoundByIdException=new EmailNotFoundByIdException("Mentioned id "+id+" is not found");
          throw emailNotFoundByIdException;
         }
     }catch (EmailNotFoundByIdException e){
         e.printStackTrace();
     }
        return email;
    }

    public String getDobById(int id) {
        String dob = null;
        try {
            for (Trainee trainee : trainees) {
                if (trainee.getId() == id) {
                    dob = trainee.getDob();
                    break;
                }
            }
            if (dob == null)
            {
                DobNotFoundByIdException dobNotFoundByIdException=new DobNotFoundByIdException("Mentioned id "+id+" is not found");
                throw dobNotFoundByIdException;
            }
        }catch (DobNotFoundByIdException e){
            e.printStackTrace();
        }
        return dob;
    }

   public String getDegreeNameByName(String name) {
        String degreeName = null;
        try{
        for(Trainee trainee:trainees){
            if(trainee.getName().equals(name)){
                degreeName = trainee.getDegreeName();
                break;
            }
        }
        if(degreeName == null)
        {
            DegreeNameNotFoundByNameException degreeNameNotFoundByNameException=new DegreeNameNotFoundByNameException("Mentioned name "+name+" is not found");
            throw degreeNameNotFoundByNameException;
        }
        }catch (DegreeNameNotFoundByNameException e){
            e.printStackTrace();
        }
        return degreeName;
    }

    public int getYearOfGraduationByDegreeName(String degreeName) {
        int yearOfGraduation = 0;
        try {
            for (Trainee trainee : trainees) {
                if (trainee.getDegreeName().equals(degreeName)) {
                    yearOfGraduation = trainee.getYearOfGraduation();
                    break;
                }
            }
            if (yearOfGraduation == 0)
            {
                YearOfGraduationNotFoundByDegreeNameException yearOfGraduationNotFoundByDegreeNameException=new YearOfGraduationNotFoundByDegreeNameException("Mentioned degree name "+degreeName+" is not found");
                throw yearOfGraduationNotFoundByDegreeNameException;
            }
        }catch (YearOfGraduationNotFoundByDegreeNameException e){
            e.printStackTrace();
        }
        return yearOfGraduation;
    }

     public boolean updateEmailById(int id, String updatedEmail) throws IdNotFoundToUpdateEmailException{
        boolean isEmailUpdated=false;
            for (int start = 0; start < trainees.length; start++) {
                if (trainees[start].getId() == id) {
                    trainees[start].setEmail(updatedEmail);
                    isEmailUpdated = true;
                    break;
                }
            }
            if (!isEmailUpdated)
            {
                IdNotFoundToUpdateEmailException idNotFoundToUpdateEmailException=new IdNotFoundToUpdateEmailException("Mentioned id "+id+" is not found");
                throw idNotFoundToUpdateEmailException;
            }

        return isEmailUpdated;
    }

    public boolean updatePhoneNumberByName(String name, long updatePhoneNumber) {
        boolean isPhoneNumberUpdated=false;
        for (Trainee trainee : trainees) {
            if (trainee.getName().equals(name)) {
                trainee.setPhoneNumber(updatePhoneNumber);
                isPhoneNumberUpdated = true;
                break;
            }
        }
        if(!isPhoneNumberUpdated)
            System.out.println(name+" not found:(");
        return isPhoneNumberUpdated;
    }

    public boolean updateIsPlacedByName(String name, boolean isPlaced) {
        boolean isPlacedUpdated=false;
        for(Trainee trainee:trainees){
            if(trainee.getName().equals(name)){
                trainee.setPlaced(isPlaced);
                isPlacedUpdated=true;
                break;
            }
        }
        if(!isPlacedUpdated)
            System.out.println(name+" not found:(");
        return isPlacedUpdated;
    }

    public boolean deleteTraineeById(int id) throws IdNotFoundToDeleteTraineeException{
        boolean isTraineeDeleted=false;
        int start, size;
        for(start=0,size=0;start<trainees.length;start++){
            if(trainees[start]!=null){
                if(trainees[start].getId()!=id){
                    trainees[size++]=trainees[start];
                }else{
                    isTraineeDeleted=true;
                }
            }
        }
        if(size==0){
            System.out.println("No trainees available");
        }else{
            trainees= Arrays.copyOf(trainees,size);
        }
        if (isTraineeDeleted==false){
            IdNotFoundToDeleteTraineeException idNotFoundToDeleteTraineeException=new IdNotFoundToDeleteTraineeException("Mentioned id "+id+" is not found");
            throw idNotFoundToDeleteTraineeException;
        }
        return isTraineeDeleted;
    }
}
