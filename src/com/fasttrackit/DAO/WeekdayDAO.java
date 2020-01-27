package com.fasttrackit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasttrackit.DBHelper.DBHelper;
import com.fasttrackit.pojo.Weekday;

public class WeekdayDAO {

	public void createWeekday(Weekday w) throws SQLException {

		Connection con = DBHelper.getConnection();

		String insertString = " INSERT INTO weekdays (id, day) VALUES(?,?)";

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

			int id = rs.getInt("id");
			String day = rs.getString("day");

			Weekday w = new Weekday(id, day);
			result.add(w);

		}

		DBHelper.closeConnection(conn);

		return result;
	}

	public Weekday getWeekdayById(String weekdayID) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from weekdays where id=?";
		PreparedStatement stmt = conn.prepareStatement(selectString);
		stmt.setString(1, weekdayID);
		ResultSet rs = stmt.executeQuery();
		Weekday result = null;
		if (rs.next()) {
			int id = rs.getInt("id");
			String day = rs.getString("day");

			result = new Weekday(id, day);

		}

		DBHelper.closeConnection(conn);
		return result;

	}

	public void updateWeekday(Weekday weekday) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String updateString = "UPDATE weekdays SET day=? where id=?";
		PreparedStatement stmt = conn.prepareStatement(updateString);
		stmt.setString(1, weekday.getDay());

		stmt.executeUpdate();

		DBHelper.closeConnection(conn);

	}

	public void delete(Weekday weekday) throws SQLException {
		Connection conn = DBHelper.getConnection();

		String deleteString = "DELETE FROM weekdays Where id=?";
		PreparedStatement stmt = conn.prepareStatement(deleteString);
		stmt.setInt(1, weekday.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(conn);

	}

}
