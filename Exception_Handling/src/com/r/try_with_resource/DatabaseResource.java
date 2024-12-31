package com.r.try_with_resource;

public class DatabaseResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Database Resource closed...");		
	}
	
}
