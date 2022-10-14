package com.mAadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mAadhar.bean.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

}
