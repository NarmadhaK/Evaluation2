package com.bluemaple.DAO;

import java.sql.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.bluemaple.dto.GetSetLogin;
import com.bluemaple.dto.GetSetMovie;
import com.bluemaple.dto.GetSetRegister;
//import com.bluemaple.dto.GetSetTimings;

@Repository
public class Daoclass implements Daointerface {

	public static List<GetSetMovie> namearray = new ArrayList<GetSetMovie>();

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public GetSetRegister getReg(GetSetRegister reg) {

		String sql = "INSERT INTO user"
				+ "(username,password,first_name,last_name,email_address,address,user_role) VALUES (?,?,?,?,?,?,?)";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, GetSetRegister.getUsername());
			ps.setString(2, GetSetRegister.getPassword());
			ps.setString(3, GetSetRegister.getFirstname());
			ps.setString(4, GetSetRegister.getLastname());
			ps.setString(5, GetSetRegister.getEmail());
			ps.setString(6, GetSetRegister.getAddress());
			ps.setString(7, GetSetRegister.getUserrole());
			ps.executeUpdate();
			System.out.println(ps);
			ps.close();

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return reg;
	}

	public GetSetLogin getLog(GetSetLogin log) {
		String query = "SELECT * FROM user WHERE username='" + log.getUsrname() + "'AND password='" + log.getPasword()
				+ "'";
		Connection conn = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			if (rs.next()) {
				if (rs.getString("username").equals(log.getUsrname())
						&& rs.getString("password").equals(log.getPasword())) {
					System.out.println("entry is correct");
				} else {
					System.out.println("sorry! wrong entry");
				}
			}

			System.out.println(ps);
			ps.close();

		} catch (SQLException e) 
		{
			System.out.println(e.getLocalizedMessage());
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return log;

	}

	public GetSetMovie getMov(GetSetMovie mov) {

		String query = "SELECT movie_name,release_date FROM movie";
		Connection conn = null;
		ResultSet rs = null;
		
		
		
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			//ps.executeUpdate();
			System.out.println(ps +" "+ rs.getFetchSize());
			while (rs.next()) {
				GetSetMovie mo = new GetSetMovie(rs.getString("movie_name"),rs.getString("release_date"));
				
			     namearray.add(mo);
				System.out.println(namearray);
			}
			
			ps.close();

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return mov;
	}

	/*public Object getTimings(GetSetTimings tym) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
