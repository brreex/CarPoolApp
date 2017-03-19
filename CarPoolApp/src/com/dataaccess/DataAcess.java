package com.dataaccess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAcess implements dataaccessfacade {

	@Override
	public boolean login(String username, String password) {
		 ResultSet rs = null;
	     java.sql.Connection connection = null;
	     Statement statement = null; 
	     
	     
	     String query = "SELECT * FROM account WHERE username= '" + username+"' AND password= '"+password+"'  ";
	     try {      
	            connection = JDBCMySQLConnection.getConnection();
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            	            
	            if (rs.next()) {
	              return true;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (connection != null) {
	                try {
	                    connection.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	     
		return false;
	}
	
	public ResultSet getUserPost(String userId) {
		 ResultSet result = null;
	     java.sql.Connection connection = null;
	     Statement statement = null; 
	     
	     
	     String query = "SELECT * FROM post WHERE userId= '" + userId+"'";
	     try {      
	            connection = JDBCMySQLConnection.getConnection();
	            statement = connection.createStatement();
	            result = statement.executeQuery(query);
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (connection != null) {
	                try {
	                    connection.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	     
		return result;
	}

	private static void updateQuery(String query) {

		java.sql.Connection connection = null;
		Statement statement = null;

		try {
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(query);
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void registerUser(String firstName, String lastName, 
			String gender, int birthDate, 
			String email, String city, String state, String street, int zipcode,String password,String username) {
		String query = "INSERT INTO users (firstname,lastname,gender,birthyear,"
				+ "state,city,street,zipcode,password,username," + "email)" + "values('" + firstName+ "','"
				+ lastName + "','" + gender + "','" + birthDate+ "','" +state+"','"+ city+"','"
				+street+"','"+zipcode+"','"+password+"','"+username+"','"+email + "')";

		updateQuery(query);
	}
}
