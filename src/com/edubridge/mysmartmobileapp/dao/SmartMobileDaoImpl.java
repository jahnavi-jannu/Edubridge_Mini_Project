package com.edubridge.mysmartmobileapp.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edubridge.mysmartmobileapp.dao.SmartMobileDao.smartmobileDao;
import com.edubridge.mysmartmobileapp.model.SmartMobile;
import com.edubridge.mysmartmobileapp.utils.DBUtils;


public class SmartMobileDaoImpl implements smartmobileDao{
	

		static Connection con = DBUtils.getConection();
		
		
		public int addSmartMobile(SmartMobile c) {
			String INSERT_QUERY = "insert into Toaster(Brand,Capacity,Colour,Price,Rating) values(?,?,?,?,?) ";
			int status = 0;
			try {
				PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
				ps.setString(1, c.getBrand());
				ps.setString(2, c.getCapacity());
				ps.setString(3, c.getColour());
				ps.setFloat(4, c.getPrice());
				ps.setDouble(5, c.getRating());

				status = ps.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			return status;
		}

		public List<SmartMobile> findSmartMobile() {

			String SELECT_QUERY = "select* from SmartMobile";

			List<SmartMobile> contactList = new ArrayList<>();

			try {
				PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					SmartMobile c = new SmartMobile();
					c.setId(rs.getInt("id"));
					c.setBrand(rs.getString("Brand"));
					c.setCapacity(rs.getString("Capacity"));
					c.setColour(rs.getString("Colour"));
					c.setPrice(rs.getFloat("price"));
					c.setRating(rs.getDouble("Rating"));
					contactList.add(c);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return contactList;

		}

		public int updateSmartMobile(SmartMobile c) {
			String UPDATE_QUERY = "update SmartMobile set Brand=?,Capacity=?,Colour=?,Price=?,Rating=? where id=?";
			int status = 0;
			try {
				PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
				ps.setString(1, c.getBrand());
				ps.setString(2, c.getCapacity());
				ps.setString(3, c.getColour());
				ps.setFloat(4, c.getPrice());
				ps.setDouble(5, c.getRating());
				ps.setInt(6, c.getId());

				status = ps.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			return status;

		}

		public int deleteSmartMobileByBrand(String Brand) {
			String DELETE_QUERY = "delete from SmartMobile where Brand=?";
			int status = 0;

			try {
				PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
				ps.setString(1, Brand);
				status = ps.executeUpdate();
			} catch (SQLException e) {

				e.printStackTrace();
			}

			return status;
		}

		public void deleteAllSmartMobile() {
			String DELETE_QUERY = "delete from Toaster";
			try {
				PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}
		

		public SmartMobile findSmartMobileByBrand(String brand) {
			SmartMobile c = null;

			String SELECT_QUERY = "Select * from SmartMobile where Brand=?";
			try {
				PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
				ps.setString(1, brand);

				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					c = new SmartMobile();
					c.setId(rs.getInt("id"));
					c.setBrand(rs.getString("Brand"));
					c.setCapacity(rs.getString("Capacity"));
					c.setColour(rs.getString("Colour"));
					c.setPrice(rs.getFloat("Price"));
					c.setRating(rs.getDouble("Rating"));

				}

			
			} catch (SQLException e) {

				e.printStackTrace();
			}
		
			return c;
		}

	}


