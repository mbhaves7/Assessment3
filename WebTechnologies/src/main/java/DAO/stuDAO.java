package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Model.stu;

public class stuDAO {
	public static void insertStu(stu s) {

		try {

			Connection con = DBConnection.DriverConnection();

			String sql = "insert into student(first_name,last_name,email,password,contact,gender)values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getFirst_name());
			pst.setString(2, s.getLast_name());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getPassword());
			pst.setLong(5, s.getContact());
			pst.setString(6, s.getGender());

			pst.executeUpdate();
			System.out.println("user data added");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {

		boolean flag = false;
		try {
			Connection conn = DBConnection.DriverConnection();
			String sql = "select * from student where email=?";
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

}