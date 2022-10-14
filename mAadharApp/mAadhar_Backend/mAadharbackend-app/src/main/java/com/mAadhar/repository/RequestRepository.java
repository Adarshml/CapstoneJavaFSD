package com.mAadhar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mAadhar.bean.Requests;

@Repository
public interface RequestRepository extends JpaRepository<Requests, String>{

	//JPQL 
		@Query("select r from Requests r where r.emailid = :emailid")
		public Requests viewmyAdhar(@Param("emailid") String emailid);
}
