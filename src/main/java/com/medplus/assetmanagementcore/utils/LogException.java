package com.medplus.assetmanagementcore.utils;

public class LogException extends Exception{
	
	
		String message;
		public LogException( String message) {
			this.message=message;
		}
		public String getErrorMessage(){
			return this.message;
		}

	}

	

