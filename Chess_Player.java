import java.util.Scanner;
public class Chess_Player{

//колличество фигур
private int numbers;
private String PlayerName;
//–јзр€д шахматиста
private int rank;



	//сами фигуры
public Chess_figure[] figures = new Chess_figure[16];
public boolean color =true;


	//функци€ установки значений
public void playerRead(){
	System.out.println("»м€ игрока");
	Scanner scan1 = new Scanner(System.in);
	PlayerName = scan1.nextLine();
	
	System.out.println("”кажите разр€д игрока");
	Scanner scan2 = new Scanner(System.in);
	rank = scan2.nextInt();
	
	System.out.println("”кажите колличество фигур");
	Scanner scan3 = new Scanner(System.in);
	numbers = scan3.nextInt();

	for (int i = 0; i < numbers; i++)
	{
		figures[i] = new Chess_figure();
		System.out.printf("\t¬вод фигур\n‘игур осталось %d\n",numbers-i);
		figures[i].Read();
		
	}
}
	//функци€ получени€ значений
public void playerInit(String Pn, int numb, Chess_figure[] cf, int razryad){
	PlayerName = Pn;
	numbers = numb;
	for (int i = 0; i < numbers; i++)
	{
		figures[i] = cf[i];
	}
	rank = razryad;
	color = false;
}
	//функци€ вывода
public void playerDisplay(){
	System.out.printf("»м€ %s \n",PlayerName);
	System.out.printf("–азр€д %d \n",rank);
	if (color)
		System.out.printf("»грает белыми\n");
	else
		System.out.printf("»грает чЄрными\n");
	
	System.out.printf(" олличество фигур %d\n",numbers);
	System.out.printf("‘игуры:\n");
	for (int i = 0; i < numbers; i++)
	{
		
		System.out.printf("%d ",i + 1);
		figures[i].Display();
	}
}

public void playerCompare(Chess_Player player){
	System.out.printf("%s VS %s\n",PlayerName,player.PlayerName);
	 
	 boolean winRank;
	 if (player.rank < rank)
	 {
		 System.out.printf(" ѕќЅ≈ƒ»“≈Ћ№ %s ", player.PlayerName);
	 }
	 if (player.rank > rank)
	 {
		 System.out.printf(" ѕќЅ≈ƒ»“≈Ћ№ %s ", PlayerName);
	 }
	 if (player.rank == rank)
	 {
		  System.out.printf(" Ќ»„№я \n");
	 }
}
	





}