package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.exception.IdNotFoundToDeleteTraineeException;
import com.xworkz.instituteapp.exception.IdNotFoundToUpdateEmailException;
import com.xworkz.instituteapp.trainee.Trainee;

public interface Template {
    public boolean addTrainee(Trainee trainee);
    public void getAllTraineeDetails();
    public void details(Trainee trainee);
    public String getNameById(int id);
    public Gender getGenderByName(String name);
    public String getNameByGender(Gender gender);
    public long getPhoneNumberByName(String name);
    public String getEmailByName(String name);
    public String getEmailById(int id);
    public String getDobById(int id);
    public String getDegreeNameByName(String name);
    public int getYearOfGraduationByDegreeName(String degreeName);
    public boolean updateEmailById(int id, String updatedEmail) throws IdNotFoundToUpdateEmailException;
    public boolean updatePhoneNumberByName(String name, long updatePhoneNumber);
    public boolean updateIsPlacedByName(String name, boolean isPlaced);
    public boolean deleteTraineeById(int id) throws IdNotFoundToUpdateEmailException, IdNotFoundToDeleteTraineeException;
}
