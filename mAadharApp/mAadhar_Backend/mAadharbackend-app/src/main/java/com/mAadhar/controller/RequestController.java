package com.mAadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mAadhar.bean.Requests;
import com.mAadhar.service.RequestService;

@RestController
@RequestMapping("request")
@CrossOrigin
public class RequestController {

	@Autowired
	RequestService reqservice;
	
	@PostMapping(value = "apply",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String requestadhar(@RequestBody Requests req) {
		return reqservice.storeRequest(req);
	}
	
	@GetMapping(value="viewAllRequest",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Requests> getAllReq() {
		return reqservice.getAllRequests();
	}
	
	@DeleteMapping(value="deny/{adharid}")
	public String deleteReq(@PathVariable("adharid") String adharid) {
		return reqservice.denyRequest(adharid);
	}
	@PatchMapping(value = "approve",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String approveRequest(@RequestBody Requests req) {
		return reqservice.approveRequest(req);
	}
	
	@PatchMapping(value = "updateadhar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateadhar(@RequestBody Requests req) {
		return reqservice.updateAdhar(req);
	}
	
	@GetMapping(value="viewmyadhar/{emailid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Requests viewmyAdhar(@PathVariable("emailid") String emailid) {
		return reqservice.viewmyAdhar(emailid);
	}
}
