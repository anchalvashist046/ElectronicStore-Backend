package com.electronic.store.ElectronicStore.repositories;

import com.electronic.store.ElectronicStore.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,String> {

}
