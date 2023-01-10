package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDAO {

	 public static PreparedStatement ps;
	 public static ResultSet rs;
	 public List<User> listUser= new ArrayList<>();
	 public static ResultSet getDataAllUser(String sql) {
	        try {
	            ps = ConnectDB.getConnect().prepareStatement(sql);
	            return ps.executeQuery();
	        } catch (Exception e) {
	            return null;
	        }
	    }
	 
	 public static void login(String username,String password) {
	        try {
	            ps = ConnectDB.getConnect().prepareStatement(sql);
	            return ps.executeQuery();
	        } catch (Exception e) {
	            return null;
	        }
	    }
}
