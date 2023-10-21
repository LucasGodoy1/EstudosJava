package db;

public class DbExcption extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DbExcption(String msg) {
		super(msg);
	}
	

}
