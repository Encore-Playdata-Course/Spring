package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.json.simple.JSONObject;

import model.domain.DTO;
import model.util.DBUtil;

public class DAO {
	static Properties comm = DBUtil.getComm();
	public static ArrayList<DTO> getAll() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<DTO> list = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(comm.getProperty("All"));
			rset = pstmt.executeQuery();
			
			list = new ArrayList<DTO>();
			while(rset.next()){
				list.add( new DTO(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7),rset.getInt(8),rset.getInt(9),rset.getInt(10), rset.getInt(11)) );
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	public static ArrayList<JSONObject> getJson() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<JSONObject> list = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(comm.getProperty("All"));
			rset = pstmt.executeQuery();
			
			list = new ArrayList<JSONObject>();
			while(rset.next()){
				JSONObject j = new JSONObject();
				j.put("employee_id", rset.getInt(1));
				j.put("first_name", rset.getString(2));
				j.put("last_name", rset.getString(3));
				j.put("hire_date", rset.getString(6));
				j.put("salary", rset.getInt(8));
				list.add(j);
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
}
