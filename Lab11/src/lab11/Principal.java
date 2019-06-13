/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.sql.*;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try{
       Class.forName("com.mysql.jdbc.Driver");
       
       Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/db_castro?user=root&amp:password=");
       Statement instruction=conexion.createStatement();
       ResultSet tabla=instruction.executeQuery("SELECT Cod_emp, Nombre FROM empleados");
       System.out.println("Codigo\tNombre");
       while(tabla.next())
       System.out.println(tabla.getInt(1)+"\t"+tabla.getString(2));
    }
    catch(ClassNotFoundException e){System.out.println(e);}
    catch(SQLException e){System.out.println(e);}
    catch(Exception e){System.out.println(e);}
    }
    }