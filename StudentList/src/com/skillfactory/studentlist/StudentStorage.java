package com.skillfactory.studentlist;

import java.util.HashMap;

public class StudentStorage {
	private HashMap<String, Student> storage;

	public StudentStorage() {
		storage = new HashMap<>();
	}

//	public void addStudent(String data) throws SizeException {
//		String[] components = data.split("\\s+");
//		if (components.length != 4) { throw new SizeException("Wrong word quant");}
//		String name = components[0] + " " + components[1];
//		storage.put(name, new Student(name, components[3], components[2]));
//		
//	}

	public void addStudent(String data) {
		try {
			String[] components = data.split("\\s+");
			if (components.length != 4) {
				throw new SizeException("Wrong words quant");
			}
			String name = components[0] + " " + components[1];
			storage.put(name, new Student(name, components[3], components[2]));
		} catch (SizeException se) {
			System.out.println(se.message);
		}

	}

	public void listStudent() {
		try {
			if (storage.size() == 0) {
				throw new SizeException("The storage is empty");
			}
			storage.values().forEach(System.out::println);
		} catch (SizeException e) {
			System.out.println(e.message);
		}
	}

	public void removeStudent(String name) {
		try {
			if (!storage.containsKey(name)) { 
				throw new MissException("No such student");
			}
			storage.remove(name);
		} catch (MissException e) {
			System.out.println(e.message);
		}
	}

//	public Student getStudentByName(String name) {	
//		try {
//			if (storage.get(name) == null) {
//				throw new MissException("Miss");
//			}
//			return storage.get(name); 	
//		} catch (MissException e) {
//			System.out.println(e.message);
//			return null;
//		} 
//			
//	}
		
	public Student getStudentByName(String name) {	
	try {
		if (storage.get(name) == null) {
			throw new MissException("Miss");
		}
		return storage.get(name); 	
	} catch (MissException e) {
		System.out.println(e.message);
		return null;
	} 
		
	}
	
		
	

	public int getCount() {
		return storage.size();
	}

	public class SizeException extends Exception {
		String message;

		public SizeException(String message) {
			this.message = message;
		}
	}
	
	public class MissException extends Exception {
		String message;

		public MissException(String message) {
			this.message = message;
		}
	}
	
	public class MyException extends Exception {
		String message;

		public MyException(String message) {
			super(message);
		}
	}
	
	
}