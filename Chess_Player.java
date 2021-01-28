import java.util.Scanner;
public class Chess_Player{


private int numbers;
private String PlayerName;
private int rank;



public Chess_figure[] figures = new Chess_figure[16];
public boolean color =true;


	

	//функция получения значений
public Chess_Player(String Pn, int numb, Chess_figure[] cf, int razryad){

	rank = razryad;
	PlayerName = Pn;
	numbers = numb;
	for (int i = 0; i < numbers; i++)
	{
		figures[i] = cf[i];
	}
	color = false;
}



	//функция вывода
public void playerDisplay(){
System.out.printf("Name -  %s \n",PlayerName);
	System.out.printf("Rank - %d \n",rank);
	if (color)
		System.out.printf("Collor is white\n");
	else
		System.out.printf("Collor is black\n");
	
	System.out.printf("Numbers of figures is %d\n",numbers);
	System.out.printf("Figures:\n");
	for (int i = 0; i < numbers; i++)
	{
		
		System.out.printf("%d ",i + 1);
		figures[i].Display();
	}

}

	




}
