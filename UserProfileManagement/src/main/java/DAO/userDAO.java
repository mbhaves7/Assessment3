package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.DBConnection;
import Model.user;

public class userDAO {

	public static void userInsert(user u) {
		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "insert into user (first_name,last_name,contact,email,password,address,gender,status)values(?,?,?,?,?,?,?,?)";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFirst_name());
			pst.setString(2, u.getLast_name());
			pst.setLong(3, u.getContact());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.setString(6, u.getAddress());
			pst.setString(7, u.getGender());
			pst.setString(8, u.getStatus());
			pst.executeUpdate();
			System.out.println("added data");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {

		boolean flag = false;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return flag;
	}

	public static user userLogin(user u) {
		user u1 = null;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from user where email=? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u1 = new user();
				u1.setUid(rs.getInt("id"));
				u1.setFirst_name(rs.getString("first_name"));
				u1.setLast_name(rs.getString("last_name"));
				u1.setContact(Long.parseLong(rs.getString("contact")));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
				u1.setAddress(rs.getString("address"));
				u1.setGender(rs.getString("gender"));
				u1.setStatus(rs.getString("status"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u1;
	}

	public static boolean checkPassword(int sid, String op) {

		boolean flag = false;

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from user where id =? and password=?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
			System.out.println("check password");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return flag;
	}

	public static void updatePassword(int sid, String np) {

		try {

			Connection conn = DBConnection.DriverConnection();
			String sql = "update user set password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, sid);

			pst.executeUpdate();
			System.out.println("update your password");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void newPassword(String email, String np) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "update user set password=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("pass updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateStatus(String email ,user u) {
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "update user set status='successful' where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			 pst.setString(1, email);
			pst.executeUpdate();
			System.out.println("updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}