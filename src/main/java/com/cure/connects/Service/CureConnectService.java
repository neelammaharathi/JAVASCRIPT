package com.cure.connects.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cure.connects.model.RegisterInfo;
import com.cure.connects.repository.CureConnectRepository;

@Service
public class CureConnectService
{	
	@Autowired
	private CureConnectRepository cureConnectRepository;
	
	public boolean doRegister(RegisterInfo registerInfo)
	{
		RegisterInfo registrerInfoSave = cureConnectRepository.save(registerInfo);
		System.out.println("Saved Data..");
		System.out.println(registrerInfoSave);
		if(registerInfo!=null)
			return true;
		return false;
	}
}
