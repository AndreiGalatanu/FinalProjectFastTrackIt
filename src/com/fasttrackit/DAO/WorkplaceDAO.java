package com.fasttrackit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasttrackit.DBHelper.DBHelper;
import com.fasttrackit.pojo.Workplace;

public class WorkplaceDAO {

	public void createWorkplace(Workplace w) throws SQLException {
		Connection conn = DBHelper.getConnection();

		String insertString = "INSERT INTO workplace (id, name, cui, locatie, nrangajati, activitate, ceo) VALUES(?,?,?,?,?,?,?)";

		PreparedStatement stmt = conn.prepareStatement(insertString);
		stmt.setInt(1, w.getId());
		stmt.setString(2, w.getName());
		stmt.setInt(3, w.getCui());
		stmt.setString(4, w.getLocatie());
		stmt.setInt(5, w.getNrAnagajati());
		stmt.setString(6, w.getActivitate());
		stmt.setString(7, w.getCeo());

		DBHelper.closeConnection(conn);

	}

	public ArrayList<Workplace> getWorkplace() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from workplace";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Workplace> result = new ArrayList<Workplace>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int cui = rs.getInt("cui");
			String locatie = rs.getString("locatie");
			int nrAnagajati = rs.getInt("nrangajati");
			String ceo = rs.getString("ceo");
			String activitate = rs.getString("activitate");
			Workplace w = new Workplace(id, name, cui, locatie, nrAnagajati, ceo, activitate);
			result.add(w);
		}

		DBHelper.closeConnection(conn);
		return result;

	}

	public Workplace getWorkplaceById(String workplaceID) throws SQLException {
		Connection conn = DBHelper.getConnection();

		String selectString = "select * from workplace where id='?'";
		PreparedStatement stmt = conn.prepareStatement(selectString);
		stmt.setString(1, workplaceID);
		ResultSet rs = stmt.executeQuery();
		Workplace result = null;

		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int cui = rs.getInt("cui");
			String locatie = rs.getString("locatie");
			int nrAnagajati = rs.getInt("nrangajati");
			String ceo = rs.getString("ceo");
			String activitate = rs.getString("activitate");
			result = new Workplace(id, name, cui, locatie, nrAnagajati, ceo, activitate);
		}

		DBHelper.closeConnection(conn);
		return result;

	}

	public void updateWorkplace(Workplace workplace) throws SQLException {
		Connection con = DBHelper.getConnection();

		String updateString = "UPDATE workplace SET name=?, cui=?,locatie=?,nrangajati=?, ceo=?, activitate=? WHERE id=?";
		PreparedStatement stmt= con.prepareStatement(updateString);
		
		stmt.setString(1, workplace.getName());
		stmt.setInt(2, workplace.getCui());
		stmt.setString(3, workplace.getLocatie());
		stmt.setInt(4, workplace.getNrAnagajati());
		stmt.setString(5, workplace.getCeo());
		stmt.setString(6, workplace.getActivitate());
		stmt.executeUpdate(); 
		
		DBHelper.closeConnection(con);
	}
	
	public void delete(Workplace workplace)throws SQLException{
		Connection con= DBHelper.getConnection();

		String deleteString="DELETE FROM workplace WHERE id=?";
		PreparedStatement stmt=con.prepareStatement(deleteString);
		stmt.setInt(1, workplace.getId());
		stmt.executeUpdate();
		
		
		DBHelper.closeConnection(con);
	}
	
	
}
