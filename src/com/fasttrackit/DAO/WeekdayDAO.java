package com.fasttrackit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fasttrackit.DBHelper.DBHelper;
import com.fasttrackit.pojo.Employee;
import com.fasttrackit.pojo.zile.Luni;

public class WeekdayDAO {
	
	
	
	public void insertLuni(Luni luni) throws SQLException{
		
		Connection conn = DBHelper.getConnection();
		
		
		String insertString=" INSERT INTO luni (nume, prenume, funcite) SELECT nume, prenume,funtie FROM employee WHERE id=?"  ;
		
		
		PreparedStatement stmt = conn.prepareStatement(insertString);
		
		stmt.setString(1, luni.getNume() );
		stmt.setString(2, luni.getPrenume());
		stmt.setString(3, luni.getFunctie());
		stmt.executeUpdate();
		
		
		
		DBHelper.closeConnection(conn);
		
		
		
	}
	

	/*public void createWeekday(Weekday w) throws SQLException {

		Connection con = DBHelper.getConnection();

		String insertString = " INSERT INTO weekdays (weekdayId, day) VALUES(?,?)";

		PreparedStatement stmt = con.prepareStatement(insertString);

		stmt.setInt(1, w.getId());
		stmt.setString(2, w.getDay());
		stmt.executeUpdate();

		DBHelper.closeConnection(con);

	}

	public ArrayList<Weekday> getWeekday() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from weekdays";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Weekday> result = new ArrayList<Weekday>();
		while (rs.next()) {

			int id = rs.getInt("weekdayId");
			String day = rs.getString("day");

			Weekday w = new Weekday(id, day);
			result.add(w);

		}

		DBHelper.closeConnection(conn);

		return result;
	}

	public Weekday getWeekdayById(int weekdayId) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from weekdays where weekdayId=?";
		PreparedStatement stmt = conn.prepareStatement(selectString);
		stmt.setInt(1, weekdayId);
		ResultSet rs = stmt.executeQuery(selectString);
		
		Weekday result = null;
		if (rs.next()) {
			
			String day = rs.getString("day");

			result = new Weekday(weekdayId, day);

		}

		DBHelper.closeConnection(conn);
		return result;

	}

	public void updateWeekday(Weekday weekday) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String updateString = "UPDATE weekdays SET day=? where weekdayId=?";
		PreparedStatement stmt = conn.prepareStatement(updateString);
		stmt.setString(1, weekday.getDay());

		stmt.executeUpdate();

		DBHelper.closeConnection(conn);

	}

	public void delete(Weekday weekday) throws SQLException {
		Connection conn = DBHelper.getConnection();

		String deleteString = "DELETE FROM weekdays Where weekdayId=?";
		PreparedStatement stmt = conn.prepareStatement(deleteString);
		stmt.setInt(1, weekday.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(conn);

	}
	/*-------------WEEK DAY + EMPLOYEES---------------     TEST  ------------------------------------------------------------------------
	public ArrayList<Weekday> getWeekdays() throws SQLException{
		
		Connection con=DBHelper.getConnection();
		
		String selectString ="select * from weekdays";
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery(selectString);
		
		ArrayList<Weekday> result = new ArrayList<Weekday>();
		
		while(rs.next()) {
			int id= rs.getInt("id");
			String day = rs.getString("day");
			
	//		int weekdayId= rs.getInt("dayid");
	//		WeekdayDAO wdao= new WeekdayDAO();
	//		Weekday d = wdao.getWeekdayById(weekdayId);
			
			EmployeeDAO edao= new EmployeeDAO();
			ArrayList<Employee> employee = edao.getEmployeeByDayId(id);
			Weekday days = new Weekday(id,day) ;
			result.add(days);
		}
		
		
		
		DBHelper.closeConnection(con);
		
		return result;
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}








































