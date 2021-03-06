package com.fasttrackit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasttrackit.DBHelper.DBHelper;
import com.fasttrackit.pojo.Employee;

public class EmployeeDAO {

	

	public void createEmployee(Employee e) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String insertString = "INSERT INTO employee (id, nume, prenume,functie, dataNastere,dataAngajare,sex,email,nrtelefon) VALUES(?,?,?,?,?,?,?,?,?)";

		PreparedStatement stmt = conn.prepareStatement(insertString);

		stmt.setInt(1, e.getId());
		stmt.setString(2, e.getNume());
		stmt.setString(3, e.getPrenume());
		stmt.setString(4, e.getFunctie());
		stmt.setString(5, e.getDataNastere());
		stmt.setString(6, e.getDataAngajare());
		stmt.setString(7, e.getSex());
		stmt.setString(8, e.getEmail());
		stmt.setString(9, e.getNrtelefon());
		stmt.executeUpdate();

		 

	}

	public ArrayList<Employee> getEmployee() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee ";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Employee> result = new ArrayList<Employee>();
		while (rs.next()) {

			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			Employee e = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);
			result.add(e);

		}

		DBHelper.closeConnection(conn);

		return result;
	}
	
	
	//------------------------------------------    LUNI                -------------------------------------------------------->
	public ArrayList<Employee> getLuni() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee where luni IS NOT NULL";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Employee> result = new ArrayList<Employee>();
		while (rs.next()) {

			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			Employee e = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);
			result.add(e);

		}

		DBHelper.closeConnection(conn);

		return result;
	}
	
	
	
	
	//------------------------------------------    MARTI          -------------------------------------------------------->
	public ArrayList<Employee> getMarti() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee where marti IS NOT NULL";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Employee> result = new ArrayList<Employee>();
		while (rs.next()) {

			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			Employee e = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);
			result.add(e);

		}

		DBHelper.closeConnection(conn);

		return result;
	}
	//------------------------------------------    MIERCURI            -------------------------------------------------------->
	public ArrayList<Employee> getMiercuri() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee where miercuri IS NOT NULL";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Employee> result = new ArrayList<Employee>();
		while (rs.next()) {

			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			Employee e = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);
			result.add(e);

		}

		DBHelper.closeConnection(conn);

		return result;
	}
	//------------------------------------------    JOI              -------------------------------------------------------->
	public ArrayList<Employee> getJoi() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee where joi IS NOT NULL";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Employee> result = new ArrayList<Employee>();
		while (rs.next()) {

			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			Employee e = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);
			result.add(e);

		}

		DBHelper.closeConnection(conn);

		return result;
	}
	//------------------------------------------    VINERI              -------------------------------------------------------->
	public ArrayList<Employee> getVineri() throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee where vineri IS NOT NULL";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Employee> result = new ArrayList<Employee>();
		while (rs.next()) {

			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			Employee e = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);
			result.add(e);

		}

		DBHelper.closeConnection(conn);

		return result;
	}
	//------------------------------------------    SAMBATA             -------------------------------------------------------->
	//------------------------------------------    DUMINICA            -------------------------------------------------------->

	
	
	
	
	
	
	
	
	
	
	

	public Employee getEmployeeById(String employeeId) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String selectString = "select * from employee where id=?";
		PreparedStatement stmt = conn.prepareStatement(selectString);
		stmt.setString(1, employeeId);
		ResultSet rs = stmt.executeQuery();
		Employee result = null;
		if (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String functie = rs.getString("functie");
			String dataNastere = rs.getString("dataNastere");
			String dataAngajare = rs.getString("dataAngajare");
			String sex = rs.getString("sex");
			String email = rs.getString("email");
			String nrtelefon = rs.getString("nrtelefon");
			result = new Employee(id, nume, prenume, functie, dataNastere, dataAngajare, sex, email, nrtelefon);

		}

		DBHelper.closeConnection(conn);
		return result;

	}

	public void updateEmployee(Employee employee) throws SQLException {

		Connection conn = DBHelper.getConnection();

		String updateString = "UPDATE employee SET nume=?,prenume=?,functie=?,dataNastere=?,dataAngajare=?,sex=?,email=?,nrtelefon=? where id=?";
		PreparedStatement stmt = conn.prepareStatement(updateString);
		stmt.setString(1, employee.getNume());
		stmt.setString(2, employee.getPrenume());
		stmt.setString(3, employee.getFunctie());
		stmt.setString(4, employee.getDataNastere());
		stmt.setString(5, employee.getDataAngajare());
		stmt.setString(6, employee.getSex());
		stmt.setString(7, employee.getEmail());
		stmt.setString(8, employee.getNrtelefon());
		stmt.setInt(9, employee.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(conn);

	}

	public void delete(Employee employee) throws SQLException {
		Connection conn = DBHelper.getConnection();

		String deleteString = "DELETE FROM employee Where id=?";
		PreparedStatement stmt = conn.prepareStatement(deleteString);
		stmt.setInt(1, employee.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(conn);

	}

	/*----  GET Employee by Schedule_ id   ---- */
	public ArrayList<Employee> getEmployeeByScheduleId(int emplyeeBySchedule) throws SQLException{
		Connection conn=DBHelper.getConnection();
		
		String selectString="select * from schedule_employee where id_schedule=? ";
		PreparedStatement stmt=conn.prepareStatement(selectString);
		stmt.setInt(1, emplyeeBySchedule);
		ResultSet rs= stmt.executeQuery(selectString);
		
		ArrayList<Integer> idEmployees = new ArrayList<Integer>();
		while(rs.next()) {
			int idEmployee= rs.getInt("id_employee");
			
			idEmployees.add(idEmployee);
		}
		
		ArrayList<Employee> result= new ArrayList<Employee>();
		
		for(Integer idEmployee : idEmployees) {
			
			// cerem din baza de date informatiile despre employees
			
			//cream o lista cu toti employees
			
			String selectEmployeeById="select * from employee where id=?";
			PreparedStatement stmtEm= conn.prepareStatement(selectEmployeeById);
			stmtEm.setInt(1, idEmployee);
			ResultSet rsEm= stmtEm.executeQuery();
			
			if(rsEm.next()) {
				String nume= rs.getString("nume");
				String prenume= rs.getString("prenume");
				String functie=rs.getString("functie");
				Employee e = new Employee(idEmployee, nume, prenume, functie);
				result.add(e);
			}
			
			
		}
		
		DBHelper.closeConnection(conn);
		return result;
	}

}
