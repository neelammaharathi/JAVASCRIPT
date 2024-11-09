package com.cure.connects.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cure.connects.Service.CureConnectService;
import com.cure.connects.model.RegisterInfo;

@Controller
public class CureConnectController
{
	
	private CureConnectService cureConnectService;
	
	@GetMapping("/home")
	public String showHome()
	{
		return "index";
	}
	@GetMapping("/doctorRegister")
	public String doDoctorRegister()
	{
		return "DoctorRegister";
	}
	@GetMapping("/doLogin")
	public String doLogin()
	{
		return "Login";
	}
	@PostMapping(value="/registerclick", consumes = {MediaType.ALL_VALUE})
	public String registerForm(@RequestBody RegisterInfo registerInfo,
			@RequestParam("certificate") MultipartFile multiPartFileCert)
	{
		System.out.println("Register button clicked...");
		
		UUID randomUUID = UUID.randomUUID();
		String userId = randomUUID.toString();
		//boolean value = cureConnectService.doRegister();
		registerInfo.setUserId(userId);
		System.out.println(registerInfo.getMeditype()+" "+registerInfo.getFirstname()+" "+registerInfo.getLastname()+" "+registerInfo.getAddress());
		System.out.println(registerInfo.getPhone()+" "+registerInfo.getLicense()+" "+registerInfo.getQualification()+" "+registerInfo.getEmail()+" "+registerInfo.getPassword());
		//boolean value = cureConnectService.doRegister(registerInfo);
		
		String filename = multiPartFileCert.getOriginalFilename();
		System.out.println("Certificate Name "+filename);
		registerInfo.setCertificateName(filename);
		try {
			byte[] certFile = multiPartFileCert.getBytes();
			registerInfo.setCertificate(certFile);
		}catch(IOException ex)
		{
			System.out.println("Something unwanted happens...");
		}
		
		if(true)
			return "RegisterNumber";
		else
			return "DoctorRegister";	
	}
}
