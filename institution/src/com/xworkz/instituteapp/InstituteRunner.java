package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.exception.IdNotFoundToDeleteTraineeException;
import com.xworkz.instituteapp.exception.IdNotFoundToUpdateEmailException;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Scanner;

import static jdk.internal.dynalink.support.Guards.isNull;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of trainees to be added: ");
        int size=s.nextInt();
        Institute institute= new Institute(size);
        for(int i= 0; i<size; i++) {
            Trainee trainee = new Trainee();
            System.out.println("Enter the id");
            int id = s.nextInt();
            trainee.setId(id);
            System.out.println("Enter the name");
            s.nextLine();
            String name = s.nextLine();
            trainee.setName(name);
            System.out.println("Enter the dob");
            s.nextLine();
            String dob = s.nextLine();
            trainee.setDob(dob);
            System.out.println("Enter the gender");
            String gender = s.next();
            trainee.setGender(Gender.valueOf(gender));
            System.out.println("Enter the email");
            s.nextLine();
            String email = s.nextLine();
            trainee.setEmail(email);
            System.out.println("Enter the phone number");
            long phNum = s.nextLong();
            trainee.setPhoneNumber(phNum);
            System.out.println("Enter the degree");
            s.nextLine();
            String degree = s.nextLine();
            trainee.setDegreeName(degree);
            System.out.println("Enter the year of graduation");
            int year = s.nextInt();
            trainee.setYearOfGraduation(year);
            System.out.println("is the trainee placed? : ");
            boolean isPlaced = s.nextBoolean();
            trainee.setPlaced(isPlaced);
            institute.addTrainee(trainee);
        }
       // institute.getAllTraineeDetails();
        String input=null;
        do{
            System.out.println("Press 1 to display all trainees details");
            System.out.println("Press 2 to display specific trainee's name  based on id");
            System.out.println("Press 3 to display specific trainee's gender based on name");
            System.out.println("Press 4 to display specific trainee's name based on gender");
            System.out.println("Press 5 to display specific trainee's phone number based on name");
            System.out.println("Press 6 to display specific trainee's email based on id");
            System.out.println("Press 7 to display specific trainee's email based on name");
            System.out.println("Press 8 to display specific trainee's dob based on id");
            System.out.println("Press 9 to display specific trainee's degree name based on name");
            System.out.println("Press 10 to display specific trainee's year of graduation name based on degree name");
            System.out.println("Press 11 to update trainee's email based on id");
            System.out.println("Press 12 to delete trainee based on id");
            int option=s.nextInt();
            switch (option){
                case 1 : institute.getAllTraineeDetails();
                break;
                case 2:
                    System.out.println("Enter the id:");
                    String name=institute.getNameById(s.nextInt());
                    System.out.println(name);
                    break;
                case 3:
                    System.out.println("Enter the name: ");
                    s.nextLine();
                    Gender gender= institute.getGenderByName(s.nextLine());
                    System.out.println(gender);
                    break;
                case 4:
                    System.out.println("Enter the gender: ");
                    String name1=institute.getNameByGender(Gender.valueOf(s.next().toLowerCase()));
                    System.out.println(name1);
                    break;
                case 5:
                    System.out.println("Enter the name: ");
                    s.nextLine();
                    long phNum=institute.getPhoneNumberByName(s.nextLine());
                    System.out.println(phNum);
                    break;
                case 6:
                    System.out.println("Enter the id: ");
                    String email=institute.getEmailById(s.nextInt());
                    System.out.println(email);
                    break;
                case 7:
                    System.out.println("Enter the name: ");
                    s.nextLine();
                    String email1=institute.getEmailByName(s.nextLine());
                    System.out.println(email1);
                    break;
                case 8:
                    System.out.println("Enter the id:");
                    String dob=institute.getDobById(s.nextInt());
                    System.out.println(dob);
                    break;
                case 9:
                    System.out.println("Enter the name: ");
                    s.nextLine();
                    String degreeName=institute.getDegreeNameByName(s.nextLine());
                    System.out.println(degreeName);
                    break;
                case 10:
                        System.out.println("Enter the degree name: ");
                        int year = institute.getYearOfGraduationByDegreeName(s.next());
                        System.out.println(year);
                    break;
                case 11:
                    try {
                        System.out.println("Enter the id: ");
                        int id = s.nextInt();
                        System.out.println("Enter the updated email: ");
                        s.nextLine();
                        String updatedEmail = s.nextLine();
                        boolean isUpdatedEmail = institute.updateEmailById(id, updatedEmail);
                        System.out.println("Is mail updated: " + isUpdatedEmail);
                    }catch (IdNotFoundToUpdateEmailException e){
                        e.printStackTrace();
                    }
                    break;
                case 12:
                    try {
                        System.out.println("Enter the id: ");
                        boolean isTraineeDeleted = institute.deleteTraineeById(s.nextInt());
                        System.out.println("Is trainee deleted: " + isTraineeDeleted);
                    }catch(IdNotFoundToDeleteTraineeException e){
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Please enter the valid option");
            }
            System.out.println("Do you want to continue? yes/no ");
            input=s.next();
        }while(input.equalsIgnoreCase("yes"));

        System.out.println("Thank you for co-operating...");
        System.out.println("main ended");

   /*     Institute institute = new Institute();
        boolean isTraineeAdded=institute.addTrainee(trainee);
        System.out.println("is trainee added: "+isTraineeAdded);
        System.out.println("**********************************");


        Trainee trainee1 = new Trainee();
        trainee1.setId(2);
        trainee1.setName("sumanth");
        trainee1.setDob("23/02/2001");
        trainee1.setGender(Gender.male);
        trainee1.setEmail("sumanth@gmail.com");
        trainee1.setPhoneNumber(7019592462L);
        trainee1.setDegreeName("B.Com");
        trainee1.setYearOfGraduation(2024);
        trainee1.setPlaced(false);
//       if(trainee1!=null)
//            System.out.println("trainee1 is not null");
//        else
//            System.out.println("trainee1 is  null");
        boolean isTrainee1Added = institute.addTrainee(trainee1);
        System.out.println("is trainee1 added: "+isTrainee1Added);
        System.out.println("**********************************");
       // institute.getAllTraineeDetails();

        Trainee trainee2 = new Trainee();
        trainee2.setId(3);
        trainee2.setName("kruthik");
        trainee2.setDob("22/07/2001");
        trainee2.setGender(Gender.male);
        trainee2.setEmail("kruthik@gmail.com");
        trainee2.setPhoneNumber(7019592213L);
        trainee2.setDegreeName("B.Com");
        trainee2.setYearOfGraduation(2024);
        trainee2.setPlaced(false);

        boolean isTrainee2Added=institute.addTrainee(trainee2);
        System.out.println("is trainee2 added: "+isTrainee2Added);
        System.out.println("**********************************");

        Trainee trainee3 = new Trainee();
        trainee3.setId(4);
        trainee3.setName("sanjay");
        trainee3.setDob("04/04/2002");
        trainee3.setGender(Gender.male);
        trainee3.setEmail("sanjay@gmail.com");
        trainee3.setPhoneNumber(7019592455L);
        trainee3.setDegreeName("B.Sc");
        trainee3.setYearOfGraduation(2023);
        trainee3.setPlaced(true);

        boolean isTrainee3Added=institute.addTrainee(trainee3);
        System.out.println("is trainee3 added: "+isTrainee3Added);
        System.out.println("**********************************");

        Trainee trainee4 = new Trainee();
        trainee4.setId(5);
        trainee4.setName("yakshith");
        trainee4.setDob("06/03/2002");
        trainee4.setGender(Gender.male);
        trainee4.setEmail("yakshith@gmail.com");
        trainee4.setPhoneNumber(7019592788L);
        trainee4.setDegreeName("B.E");
        trainee4.setYearOfGraduation(2023);
        trainee4.setPlaced(true);

        boolean isTrainee4Added=institute.addTrainee(trainee4);
        System.out.println("is trainee4 added: "+isTrainee4Added);
        System.out.println("**********************************");

//        Trainee trainee5=new Trainee();
//        institute.addTrainee(trainee5);
        institute.getAllTraineeDetails();

        String name = institute.getNameById(1);
        System.out.println("id belongs to "+name );
        System.out.println("=============================");

        Gender gender = institute.getGenderByName("sumanth");
        System.out.println("trainee's gender is "+gender );
        System.out.println("=============================");

        String name1 = institute.getNameByGender(Gender.male);
        System.out.println("trainee's name is "+name1 );
        System.out.println("=============================");

        long phoneNumber = institute.getPhoneNumberByName("kruthik");
        System.out.println("trainee's phone number is "+phoneNumber );
        System.out.println("=============================");

        String email = institute.getEmailByName("sanjay");
        System.out.println("trainee's email is "+email );
        System.out.println("=============================");

        String email1 = institute.getEmailById(5);
        System.out.println("trainee's email is "+email1 );
        System.out.println("=============================");

        String dob = institute.getDobById(3);
        System.out.println("trainee's dob is "+dob );
        System.out.println("=============================");

        String degreeName = institute.getDegreeNameByName("sanjay");
        System.out.println("trainee's degree name is "+degreeName );
        System.out.println("=============================");

        int yearOfGraduation = institute.getYearOfGraduationByDegreeName("B.Com");
        System.out.println("trainee's year of graduation is "+yearOfGraduation );
        System.out.println("=============================");

        boolean isEmailUpdated = institute.updateEmailById(1, "prajwalkm@gmail.com");
        System.out.println("trainee's email updated:  "+isEmailUpdated );
        System.out.println("=============================");

        boolean isPhoneNumberUpdated = institute.updatePhoneNumberByName("prajwal", 9164704168L);
        System.out.println("trainee's phone number updated:  "+isPhoneNumberUpdated );
        System.out.println("=============================");

        boolean isPlacedUpdated= institute.updateIsPlacedByName("prajwal",true);
        System.out.println("is trainee placed: "+isPlacedUpdated );
        System.out.println("=============================");

        boolean isTraineeDeleted = institute.deleteTraineeById(1);
        System.out.println("is trainee deleted: "+isTraineeDeleted );
        System.out.println("=============================");

 */


    }
}
