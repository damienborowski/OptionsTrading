//Code by Damien Borowski
//This program is used for calculating profits and will hopefully be able
//to do more as I update it and add more functionalities as well as improving
//the current ones.

//Main class which calls all the various actions
public class Trading {
	public static void main(String[] args){
		
		int Choice;
		
		do {
			Choice = Inputs.Selection();
			if(Choice == 1) {
				Inputs.ProfitOption();
			}
		}while(Choice != 0);
	}
}
