package hu.miskolc.uni.iit.contactlearn.models;

import java.util.Date;

import lombok.Data;

/**
 * Created by torok14 on 2017. 10. 06..
 */

@Data
public class Contatct {
    private long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String birthPlace;
    private String address;
    private String phoneNumber;
    private String email;
    private String photoId;
    private String job;
    private String company;
    private String companyAddress;
    private String companyPhoneNumber;
    private String companyEmail;
}
