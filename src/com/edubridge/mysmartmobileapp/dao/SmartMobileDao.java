package com.edubridge.mysmartmobileapp.dao;

import java.util.List;
import com.edubridge.mysmartmobileapp.model.SmartMobile;
public class SmartMobileDao {
	

	

	public interface smartmobileDao {
			int addSmartMobile(SmartMobile c);
			List<SmartMobile> findSmartMobile();
			SmartMobile findSmartMobileByBrand(String brand);
			int updateSmartMobile(SmartMobile c);
			int deleteSmartMobileByBrand(String brand);
			void deleteAllSmartMobile();
			
			
		}                                                      

}
