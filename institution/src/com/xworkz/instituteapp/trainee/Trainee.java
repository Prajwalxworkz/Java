package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.Gender;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trainee {
    private int id;
    private String name;
    private String degreeName;
    private int yearOfGraduation;
    private String dob;
    private String email;
    private Gender gender;
    private long phoneNumber;
    private boolean isPlaced;


}
