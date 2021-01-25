import java.util.Scanner;
public class Chess_Player{

//колличество фигур
private int numbers;
private String PlayerName;
//РАзряд шахматиста
private int rank;



	//сами фигуры
public Chess_figure[] figures = new Chess_figure[16];
public boolean color =true;


	//функция установки значений
public void playerRead(){
	System.out.println("Имя игрока");
	Scanner scan1 = new Scanner(System.in);
	PlayerName = scan1.nextLine();
	
	System.out.println("Укажите разряд игрока");
	Scanner scan2 = new Scanner(System.in);
	rank = scan2.nextInt();
	
	System.out.println("Укажите колличество фигур");
	Scanner scan3 = new Scanner(System.in);
	numbers = scan3.nextInt();

	for (int i = 0; i < numbers; i++)
	{
		System.out.printf("\tВвод фигур\nФигур осталось %d\n",numbers-i);
		figures[i].Read();
		
	}
}
	//функция получения значений
public void playerInit(String PlayerName, int numbers, Chess_figure[] cf, int rank){
	this.PlayerName = PlayerName;
	this.numbers = numbers;
	for (int i = 0; i < numbers; i++)
	{
		figures[i] = cf[i];
	}
	this.rank = rank;
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

public void playerCompare(Chess_Player player){

}
	





}