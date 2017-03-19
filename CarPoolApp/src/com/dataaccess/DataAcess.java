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
}
