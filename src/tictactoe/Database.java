/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;
import java.util.Date;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author H.P. Asela
 */
public class Database {
   
public void insertdetails(String player,String status,String diff) throws ClassNotFoundException, SQLException
{
	//main class	
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    //System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
	Class.forName("com.mysql.jdbc.Driver");
	//load the jdbc driver class
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/game","root","");/* red colored part has to be as per your database*/
	/*make connection with the database(db name ecommerce, user is root and password is not set in my case put yours in those places with password if you have set password for the database*/
	PreparedStatement stmt = con.prepareStatement("INSERT INTO `score` (difficulty,user,status,date) "+ "VALUES ('"+diff+"','"+player+"','"+status+"','"+dateFormat.format(date)+"')");
        
        //System.out.println(""+stmt.toString());    
        stmt.executeUpdate();
           // System.out.println(""+stmt.toString());
//PreparedStatement statement = con.prepareStatement("Select * from score");
	/*sql structure to select instances from the table*/
	//ResultSet result = statement.executeQuery();
	/*execution of the database query*/ 
	
	//while(result.next()){
		//System.out.println(result.getString(1) +"\t"+ result.getString(2)+ "\t" + result.getString(3)+ "\t" + result.getString(4));
		/*print the result with three attributes from the table 'products in my case' */
	//	}
	}
public void insertdetailsTwoplayers(String player1,String player2,String winner) throws ClassNotFoundException, SQLException
{
	//main class	
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    //System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
	Class.forName("com.mysql.jdbc.Driver");
	//load the jdbc driver class
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/game","root","");/* red colored part has to be as per your database*/
	/*make connection with the database(db name ecommerce, user is root and password is not set in my case put yours in those places with password if you have set password for the database*/
	PreparedStatement stmt = con.prepareStatement("INSERT INTO `twoplayergame` (player1,player2,winner,time) "+ "VALUES ('"+player1+"','"+player2+"','"+winner+"','"+dateFormat.format(date)+"')");
        
        //System.out.println(""+stmt.toString());    
        stmt.executeUpdate();
           // System.out.println(""+stmt.toString());
//PreparedStatement statement = con.prepareStatement("Select * from score");
	/*sql structure to select instances from the table*/
	//ResultSet result = statement.executeQuery();
	/*execution of the database query*/ 
	
	//while(result.next()){
		//System.out.println(result.getString(1) +"\t"+ result.getString(2)+ "\t" + result.getString(3)+ "\t" + result.getString(4));
		/*print the result with three attributes from the table 'products in my case' */
	//	}
	}

}


