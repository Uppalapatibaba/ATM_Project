package Com.bank;

import java.io.IOException;

public class ATM 
{

	public static void main(String[] args) throws IOException 
	{
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	private static void introduction() 
	{	
		System.out.println("Welcome to the ATM project!");
	}
}
