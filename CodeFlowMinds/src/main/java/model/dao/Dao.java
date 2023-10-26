package model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao { 
	
	public Connection conn; // DB연동 객체
	public PreparedStatement ps; // 연동된 DB에서 SQL 조작하는 객체
	public ResultSet rs; // SQL 조작 결과를 가져오는 객체
	
	protected Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeflowminds","root","1234");
			System.out.println("안내] DB연동 성공");
		} catch (Exception e) {
			System.out.println("안내] DB연동 실패 : " + e);
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public PreparedStatement getPs() {
		return ps;
	}
	public void setPs(PreparedStatement ps) {
		this.ps = ps;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	
}
