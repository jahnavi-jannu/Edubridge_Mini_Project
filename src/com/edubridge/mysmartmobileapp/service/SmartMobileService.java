package com.edubridge.mysmartmobileapp.service;
import java.util.List;

import com.edubridge.mysmartmobileapp.model.SmartMobile;

public interface SmartMobileService {
	

		int addSmartMobile( SmartMobile c);
		List<SmartMobile> findSmartMobile();
		SmartMobile findSmartMobileByBrand(String brand);
		int updateSmartMobile(SmartMobile c);
		int deleteSmartMobileByBrand(String brand);
		void deleteAllSmartMobile();
		
	}


