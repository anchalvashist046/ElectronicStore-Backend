package com.electronic.store.ElectronicStore.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.BatchSize;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {

    private String userId;

    @Size(min = 3,max =15 , message =" Invalid Name!!")
    private String name;

    @NotBlank(message ="Invalid password!!")
    private String password;

    //@Email(message= "Invalid email!!")
    @Pattern(regexp = "^[a-z0-9][-a-z0-9._]+@([-a-z0-9]+\\.)+[a-z]{2,5}$", message = "Invalid User Email !!")
    @NotBlank(message ="Email is required!!")
    private String email;

    @Size(min= 3 ,max = 5,message="Invalid Gender!!")
    private String gender;

    @NotBlank(message="please write something about yourself !!")
    private String about;


    private String imageName;
}
