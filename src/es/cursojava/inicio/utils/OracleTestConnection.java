// Prueba de conexion que saque de chatgpt

package es.cursojava.inicio.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleTestConnection {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
		String usuario = "getafe";
		String contrasena = "password";

		try (Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contrasena)) {
			System.out.println("✅ Conexión establecida correctamente.");
		} catch (SQLException e) {
			System.err.println("❌ Error de conexión:");
			e.printStackTrace();
		}
	}
}
