package com.edubridge.mysmartmobileapp.service;
import java.util.List;

import com.edubridge.mysmartmobileapp.dao.SmartMobileDao;
import com.edubridge.mysmartmobileapp.dao.SmartMobileDaoImpl;
import com.edubridge.mysmartmobileapp.model.SmartMobile;


public class SmartMobileImpl implements SmartMobileService {
	
	public class SmartMobileServiceImpl  implements SmartMobileService {
		SmartMobileDaoImpl dao = new SmartMobileDaoImpl();	
		
		@Override
		public int addSmartMobile(SmartMobile c) {
			
			return dao.addSmartMobile(c);
		}

		@Override
		public List<SmartMobile> findSmartMobile() {
			// TODO Auto-generated method stub
			return dao.findSmartMobile();
		}

		@Override
		public SmartMobile findSmartMobileByBrand(String brand) {
			// TODO Auto-generated method stub
			return dao.findSmartMobileByBrand(brand);
		}

		@Override
		public int updateSmartMobile(SmartMobile c) {
			// TODO Auto-generated method stub
			return dao.updateSmartMobile(c);
		}

		@Override
		public int deleteSmartMobileByBrand(String brand) {
			// TODO Auto-generated method stub
			return dao.deleteSmartMobileByBrand(brand);
		}

		@Override
		public void deleteAllSmartMobile() {
			// TODO Auto-generated method stub
			
		}

	}

	@Override
	public int addSmartMobile(SmartMobile c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SmartMobile> findSmartMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SmartMobile findSmartMobileByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSmartMobile(SmartMobile c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSmartMobileByBrand(String brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteAllSmartMobile() {
		// TODO Auto-generated method stub
		
	}
	

}
