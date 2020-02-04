package com.fasttrackit.DAO;

public class ScheduleDAO {

/*

		public void createSchedule(Schedule s) throws SQLException {
		Connection conn = DBHelper.getConnection();

		String insertString = "INSERT INTO schedule(scheduleId) VALUES (?)";
		PreparedStatement stmt = conn.prepareStatement(insertString, Statement.RETURN_GENERATED_KEYS);
		stmt.setInt(1, s.getWeekday().getId());

		stmt.executeUpdate();

		ResultSet rs = stmt.getGeneratedKeys();
		rs.next();
		s.setId((rs.getInt(1)));

		for (Employee employee : s.getEmployees()) {
			String insertEmployeeSchedule = "INSERT INTO schedule_employee(id_schedule,id_employee) VALUES(?,?)";
			PreparedStatement stmt2 = conn.prepareStatement(insertEmployeeSchedule);
			stmt2.setInt(1, s.getId());
			stmt2.setInt(2, employee.getId());

		}

		DBHelper.closeConnection(conn);
	}

	public ArrayList<Schedule> getSchedule() throws SQLException {

		Connection con = DBHelper.getConnection();

		String selectString = "select * from schedule";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Schedule> result = new ArrayList<Schedule>();

		while (rs.next()) {

			int scheduleId = rs.getInt("scheduleId");
			
			
			// weekday
			int weekdayId=rs.getInt("weekdayId");
			WeekdayDAO wdao = new WeekdayDAO();
			Weekday wday= wdao.getWeekdayById(weekdayId);

			// employee
			
			int id=rs.getInt("id_schedule");
			EmployeeDAO edao = new EmployeeDAO();
			ArrayList<Employee> employee = edao.getEmployeeByScheduleId(id);
			
			Schedule s = new Schedule(scheduleId,wday, employee);
			
			result.add(s);

		}

		DBHelper.closeConnection(con);

		return result;
	}
*/
}

