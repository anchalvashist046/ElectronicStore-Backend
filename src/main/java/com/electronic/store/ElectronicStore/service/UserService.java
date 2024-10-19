package com.electronic.store.ElectronicStore.service;

import com.electronic.store.ElectronicStore.dtos.UserDto;
import com.electronic.store.ElectronicStore.entities.User;

import java.util.List;

public interface UserService {
    //create
    UserDto createUser(UserDto userDto);
    //update
    UserDto updateUser(UserDto userDto, String userId);
    //delete
    void deleteUser(String userId);
    //get all user
    List<UserDto> getAllUser();
    //get single user by id
    UserDto getUserById(String userId);
    ////get single user by email
    UserDto getUserByEmail(String email);
    //search user
     List<UserDto> searchUser(String keyword);
}
