package com.gv.exception;

public class ThrowC {
	
	public static void main(String[] args) throws MyException{
		try{
			isUserValid("userName","Password");
		}catch(MyException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	private static void isUserValid(String uN, String pwd) throws MyException {
		boolean isValidUser = getUserNamePwdFromDB(uN,pwd);
		if(isValidUser){
			return;
		}
		else{
			throw new MyException("Invalid user");
		}
		
	}

	private static boolean getUserNamePwdFromDB(String uN, String pwd) {
		// do DB stuff
		return false;
	}
	
	
	

}
