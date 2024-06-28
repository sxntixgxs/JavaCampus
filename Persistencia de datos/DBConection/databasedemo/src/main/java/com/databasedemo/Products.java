package com.databasedemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Products {
    public static void main(String[] args) /*throws SQLException*/ {
        String url = "jdbc:mysql://localhost:3306/products";//jdbc es java database conection y en products va el nombre de la db
        String user = "campus2023";
        String password = "campus2023";
        // try {
        //     Connection connection = DriverManager.getConnection(url, user, password);
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }
        // try(Connection connection = DriverManager.getConnection(url, user, password);
        // Statement statement = connection.createStatement()){
        //     //Crear tabla
        //     String createTableSQL  = "CREATE TABLE IF NOT EXISTS inventario(" +
        //                             "id INT PRIMARY KEY AUTO_INCREMENT, "+
        //                             "name VARCHAR(50));";
        //     statement.execute(createTableSQL);
        //     System.out.println("Tabla creada! ");
        // }
        try {
            // CREATE TABLE
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            // String createTableSQL  = "CREATE TABLE IF NOT EXISTS category(" +
            //                         "id INT PRIMARY KEY AUTO_INCREMENT, "+
            //                         "name VARCHAR(50));";
            // statement.execute(createTableSQL);





            //INSERTS
            // String insertData = "INSERT INTO category (name) VALUES "+
            // "('Pinturas'), "+
            // "('Herramientas');";
            // statement.executeUpdate(insertData);//como se insertan datos es executeUpdate
            // System.out.println("Categorias registradas");

            //Consultar datos
            // String query = "SELECT id AS ID, name AS CATEGORY FROM category;";
            // ResultSet resultSet = statement.executeQuery(query);

            // // Procesar resultados
            // while(resultSet.next()){
            //     int id = resultSet.getInt("ID");
            //     String name = resultSet.getString("CATEGORY");
            //     System.out.println(MessageFormat.format("ID Category {0} - Nombre {1}", id, name));
            // }

            // UPDATE
            // String update = "UPDATE category SET name = 'Grifos' WHERE id = 1";
            // int rowsUpdated = statement.executeUpdate(update);
            // System.out.println("Nro filas actualizadas/afectadas "+rowsUpdated);


            //DELETE
            String delete = "DELETE FROM category WHERE id = 1";
            int rowsDeleted  = statement.executeUpdate(delete);
            System.out.println("Nro filas eliminadas: "+rowsDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}