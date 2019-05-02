package fr.operateurs.console;

import java.util.Scanner;

public class OperateurApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner questionUser;
		System.out.println("*****  Application Opérateurs ***** \nVeuillez saisir le premier nombre...");
		
		questionUser = new Scanner(System.in);
		int nombre1 = questionUser.nextInt(); 
		
		System.out.println("Veuillez saisir le second nombre...");
		
		questionUser = new Scanner(System.in);
		int nombre2 = questionUser.nextInt(); 
		
		System.out.println(""+nombre1+"+"+nombre2+"="+(nombre1+nombre2));
		System.out.println(""+nombre1+"*"+nombre2+"="+(nombre1*nombre2));
		System.out.println(""+nombre1+"-"+nombre2+"="+(nombre1-nombre2));
		System.out.println(""+nombre1+"/"+nombre2+"="+(nombre1/nombre2));
		
		

	}

}
