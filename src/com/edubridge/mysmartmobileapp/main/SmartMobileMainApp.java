package com.edubridge.mysmartmobileapp.main;

import java.util.List;
import java.util.Scanner;

import com.edubridge.mysmartmobileapp.model.SmartMobile;
import com.edubridge.mysmartmobileapp.service.SmartMobileService;
import com.edubridge.mysmartmobileapp.service.SmartMobileImpl;



public class SmartMobileMainApp {
	
		public static void main(String[] args) {
			SmartMobileService Service = new SmartMobileImpl();
			SmartMobile c = null;
			Scanner in = new Scanner(System.in);
			int option;
			do {
				System.out.println("welcome to SmartMobile App");
				System.out.println("***");
				System.out.println("1. Add SmartMobile");
				System.out.println("2. view SmartMobile");
				System.out.println("3. Search SmartMobile");
				System.out.println("4. Update SmartMobile");
				System.out.println("5. Delete SmartMobile");
				System.out.println("6. DeleteAll SmartMobile");
				System.out.println("0. exit");
				System.out.println("please choose option");
				option = in.nextInt();

				switch (option) {
				case 1:
					System.out.println(" Add NEW SmartMobile ");
					System.out.println("-----------------");
					System.out.println("Please enter brand name:");
					String Brand = in.next();
					System.out.println("please enter gb :");
					String Capacity = in.next();
					System.out.println("please enter Colour:");
					String Colour =in.next();
					System.out.println("please enter Price:");
					Float Price = in.nextFloat();
					System.out.println("please enter rating:");
					Double Rating=in.nextDouble();
					c=new SmartMobile();
					c.setBrand(Brand);
					c.setCapacity(Capacity);
					c.setColour(Colour);
					c.setPrice(Price);
					c.setRating(Rating);
					
					int status =Service.addSmartMobile(c);
					if(status==1) {
						System.out.println("New SmartMobile added!");

					}else {
						System.out.println("something is wrong!");

					}

					break;
				case 2:
					System.out.println("view All SmartMobile");
					List<SmartMobile> mobile=Service.findSmartMobile();
					System.out.println("BRAND\sCAPACITY\sCOLOUR\sPRICE\sRATING");
					System.out.println("------\s-------\s-------\s-----\s------");

					for(SmartMobile smartmobiles:mobile) {
						System.out.println(smartmobiles.getBrand()+"\s" +smartmobiles.getId()+"\s"+smartmobiles.getColour()+"\s"+smartmobiles.getPrice()+"\s"+smartmobiles.getRating());

					}
					break;
				case 3:
					
					System.out.println("search SmartMobile");
					System.out.println("please enter SmartMobile brand");
					String searchBrand=in.next();
					SmartMobile searchSmartMobile=Service.findSmartMobileByBrand(searchBrand);
					if(searchSmartMobile !=null) {
						System.out.println("ID: "+searchSmartMobile.getId());
						System.out.println("Brand: "+searchSmartMobile.getBrand());
						System.out.println("CAPACITY: "+searchSmartMobile.getcapacity());
						System.out.println("Colour: "+searchSmartMobile.getColour());
						System.out.println("Price:"+searchSmartMobile.getPrice());
						System.out.println("Rating:"+searchSmartMobile.getRating());
						
					}else {
						System.out.println("No SmartMobilefound!");
					}
					
					break;
					
				case 4:
					//System.out.println("update Contact");
					System.out.println("please enter brand name:");
					searchBrand=in.next();				
					searchSmartMobile=Service.findSmartMobileByBrand(searchBrand);
					
					if(searchBrand !=null) {
						//displaying existing contact details
						System.out.println("ID: "+searchSmartMobile.getId());  
						System.out.println("Brand: "+searchSmartMobile.getBrand());
						System.out.println("Capacity: "+searchSmartMobile.getCapacity());
						System.out.println("Colour: "+searchSmartMobile.getColour());
						System.out.println("Price:"+searchSmartMobile.getPrice());
						System.out.println("Rating:"+searchSmartMobile.getRating());
						
						//reading contact update info
						System.out.println("please enter updated Brand:");
						Brand=in.next();
						System.out.println("please enter update Capacity:");
						Capacity=in.next();
						System.out.println("please enter update colour:");
						Colour=in.next();
						System.out.println("please enter update price :");
						Price=in.nextFloat();
						System.out.println("please enter update rating:");
						Rating=in.nextDouble();
						
						SmartMobile updateSmartMobile=new SmartMobile();
						updateSmartMobile.setBrand(Brand);
	                    updateSmartMobile.setCapacity(Capacity);
	                    updateSmartMobile.setColour(Colour);
	                    updateSmartMobile.setId(searchSmartMobile.getId());
	                    
	                    int updateStatus =Service.updateSmartMobile(updateSmartMobile);
	                    if(updateStatus ==1) {
	                    	System.out.println("contact updated successfully");
	                    }else {
	                    	System.out.println("something is wrong !");
	                    }
						
					}else {
						System.out.println("contact not found with name");
					}
					break;
				case 5:
					System.out.println("delete smartmobile");
					System.out.println("please enter toaster name");
					searchBrand = in.next();
					searchSmartMobile = Service.findSmartMobileByBrand(searchBrand);
					if(searchSmartMobile !=null) {
						int deleteStatus = Service.deleteSmartMobileByBrand(searchBrand);
						if(deleteStatus==1) {
							System.out.println("smartmobile deleted sucessfully");
						}else {
							System.out.println("something went wrong");
						}
						
					}
							break;
				case 6:
					System.out.println(" Are you sure delete All smartmobile?[Y/N]");
					String deleteConfirmStatus = in.next();
					if(deleteConfirmStatus.equalsIgnoreCase("Y")){
						Service.deleteAllSmartMobile();
						System.out.println("all smartmobiles deleted ");
					}
					break;
				case 0:
					System.out.println("Bye!!!");
					System.exit(0);
					break;
				default:
					System.out.println("invalid option!");
					break;

				}
			} while (option != 0);
		}

		private List<SmartMobile> findToaster() {
			// TODO Auto-generated method stub
			return null;
		}

		private SmartMobile findSmartMobileByBrand(String searchBrand) {
			// TODO Auto-generated method stub
			return null;
		}

	}



