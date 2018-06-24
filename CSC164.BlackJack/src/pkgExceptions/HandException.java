package pkgExceptions;

import pkgEnum.eExceptionType;

import pkgGame.Hand;

public class HandException extends Exception {

	private eExceptionType eExceptionType;
	private Hand d;
	
	public HandException(eExceptionType eType, Hand d)
	{
		this.eExceptionType = eType;
		this.d = d;
	}

	public eExceptionType geteExceptionType() {
		return eExceptionType;
	}

	public Hand getD() {
		return d;
	}
	
	
	
}