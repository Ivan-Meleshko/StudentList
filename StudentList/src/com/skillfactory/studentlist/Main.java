package com.skillfactory.studentlist;

import java.util.Scanner;

import com.skillfactory.studentlist.StudentStorage.MyException;
import com.skillfactory.studentlist.StudentStorage.SizeException;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentStorage newStorage = new StudentStorage();
		
		
		while (true) {
            String command = sc.nextLine();
            String[] tokens = command.split("\\s+", 2);
            if (tokens[0].equals("add")) {
                newStorage.addStudent(tokens[1]);		
            } else if (tokens[0].equals("list")) {
                newStorage.listStudent();
            } else if (tokens[0].equals("get")) {
					newStorage.getStudentByName(tokens[1]).toString();
            } else if (tokens[0].equals("remove")) {
                newStorage.removeStudent(tokens[1]);
            } else if (tokens[0].equals("count")) {
                System.out.println("There are " + newStorage.getCount() + " customers");
            } else if (tokens[0].equals("help")) {
                System.out.println(helpText);
            } else {
                System.out.println(commandError);
            }
        }

	}
	
	 private static String addCommand = "add Василий Петров " +
	            "vasily.petrov@gmail.com +79787775747";
	    private static String commandExamples = "\t" + addCommand + "\n" +
	            "\tlist\n\tcount\n\tremove Василий Петров";
	    private static String commandError = "Wrong command! Available command examples: \n" +
	            commandExamples;
	    private static String helpText = "Command examples:\n" + commandExamples;


}
