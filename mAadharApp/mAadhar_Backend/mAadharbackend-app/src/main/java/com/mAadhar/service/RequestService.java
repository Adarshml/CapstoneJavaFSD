package com.mAadhar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mAadhar.bean.Requests;
import com.mAadhar.repository.RequestRepository;

@Service
public class RequestService {

	@Autowired
	RequestRepository reqrepo;
	
	public String storeRequest(Requests req) {
		reqrepo.save(req);
		return "Aadhar Application Request Submitted";
	}
	
	public List<Requests> getAllRequests() {
		return reqrepo.findAll();
	}
	
	public String denyRequest(String adharid) {
		Optional<Requests> result  = reqrepo.findById(adharid);
		if(result.isPresent()) {
			Requests p = result.get();
			reqrepo.delete(p);
			return "Application Denied";
		}else {
			return "Application not present";
		}
	}
	public String approveRequest(Requests req) {
		Optional<Requests> result  = reqrepo.findById(req.getAdharid());
		if(result.isPresent()) {
			Requests p = result.get();
			reqrepo.saveAndFlush(p);
			return "Application Approved";
		}else {
			return "Application not present";
		}
	}
	
	public String updateAdhar(Requests req) {
		Optional<Requests> result  = reqrepo.findById(req.getAdharid());
		if(result.isPresent()) {
			Requests p = result.get();
			p.setAge(req.getAge());
			p.setName(req.getName());
			p.setAddress(req.getAddress());
			reqrepo.saveAndFlush(p);
			return "Aadhar Card Updation Requested";
		}else {
			return "Aadhar not present";
		}
	}
	
	public Requests viewmyAdhar(String emailid) {
		return reqrepo.viewmyAdhar(emailid);
	}
}
