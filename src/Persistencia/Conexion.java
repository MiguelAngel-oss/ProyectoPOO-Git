
package Persistencia;
import java.sql.*;

public class Conexion {
   static String url = "jdbc:mysql://localhost:3306/bd_posta";
   static String user ="root";
   static String pass= "2005";
    
   public static Connection conectar(){
       Connection con= null;
       try{
           con=DriverManager.getConnection(url,user,pass);
           System.out.println("Conexion exitosa");
       }catch(SQLException e){
           e.printStackTrace();
       }
       return con;
   } 
}
