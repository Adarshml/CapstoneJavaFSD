package com.mAadhar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mAadhar.bean.Login;
import com.mAadhar.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	public String signIn(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
					Login ll = result.get();
					if(ll.getPassword().equals(login.getPassword())) {								
						if(login.getTypeOfUser().equals(ll.getTypeOfUser())) {
							if(login.getTypeOfUser().equals("admin")) {
								return "Admin sucessfully login";
							}
							else{
								return "User successfully login";
						}
						}else {
							return "Invalid Credentials! Try Again!";
						}					
					}else {
						return "Invalid Password! Try Again!";
					}
		}else{
			return "Invalid EmailId! Try Again!";
		}		
	}
	
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
					return "Email Id alreay exist";
		}else {
			if(login.getTypeOfUser().equals("admin")) {
				return "You can't create admin account";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
			}
	}
}

