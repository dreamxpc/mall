package cafe.jjdev.mall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cafe.jjdev.mall.service.Member;

public class MemberDao {

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver");
		String jdbcDriver = "jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=euckr";
		String dbID = "root";
		String dbPW = "java0000";
		connection = DriverManager.getConnection(jdbcDriver, dbID, dbPW);
		return connection;
	}

	private void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	public int insertMember(Member member) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = this.getConnection();
			preparedStatement = connection.prepareStatement("insert into member (id, pw, level) value (?, ?, ?)");
			preparedStatement.setString(1, member.getId());
			preparedStatement.setString(2, member.getPw());
			preparedStatement.setInt(3, member.getLevel());

			preparedStatement.executeUpdate();

			preparedStatement.close();
			connection.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			this.close(connection, preparedStatement, resultSet);
		}

		return 0;
	}

	public boolean loginMember(Member member) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean loginResult = false;

		try {
			connection = this.getConnection();
			preparedStatement = connection.prepareStatement("select id, level from member where id=? and pw=?");
			preparedStatement.setString(1, member.getId());
			preparedStatement.setString(2, member.getPw());

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				loginResult = true;
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			this.close(connection, preparedStatement, resultSet);
		}

		return loginResult;
	}

}