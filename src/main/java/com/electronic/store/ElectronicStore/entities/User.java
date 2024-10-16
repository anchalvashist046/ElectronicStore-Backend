package com.electronic.store.ElectronicStore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "users")
public class User {
    @Id
    @Column(name="User_ID", unique=true)
    private String userId;

    @Column(name="User_Name")
    private String name;

    @Column(name="User_Password" , length=10)
    private String password;

    @Column(name="User_Email",unique= true)
    private String email;

    private String gender;
    private String about;

    @Column(name="user_Image_name")
    private String imageName;
}
