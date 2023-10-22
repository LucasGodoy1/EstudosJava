package App;

import java.sql.Connection;

import db.DB;

public class Programa {

	public static void main(String[] args) {
		Connection cnx = DB.getConnection();
		DB.closeConnection();

	}

}
