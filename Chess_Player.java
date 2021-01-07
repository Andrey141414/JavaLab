import java.util.Scanner;
public class Chess_Player{

//����������� �����
private int numbers;
private String PlayerName;
//������ ����������
private int rank;



	//���� ������
public Chess_figure[] figures = new Chess_figure[16];
public boolean color =true;


	//������� ��������� ��������
public void playerRead(){
	System.out.println("��� ������");
	Scanner scan1 = new Scanner(System.in);
	PlayerName = scan1.nextLine();
	
	System.out.println("������� ������ ������");
	Scanner scan2 = new Scanner(System.in);
	rank = scan2.nextInt();
	
	System.out.println("������� ����������� �����");
	Scanner scan3 = new Scanner(System.in);
	numbers = scan3.nextInt();

	for (int i = 0; i < numbers; i++)
	{
		figures[i] = new Chess_figure();
		System.out.printf("\t���� �����\n����� �������� %d\n",numbers-i);
		figures[i].Read();
		
	}
}
	//������� ��������� ��������
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
	//������� ������
public void playerDisplay(){
	System.out.printf("��� %s \n",PlayerName);
	System.out.printf("������ %d \n",rank);
	if (color)
		System.out.printf("������ ������\n");
	else
		System.out.printf("������ �������\n");
	
	System.out.printf("����������� ����� %d\n",numbers);
	System.out.printf("������:\n");
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
		 System.out.printf(" ���������� %s ", player.PlayerName);
	 }
	 if (player.rank > rank)
	 {
		 System.out.printf(" ���������� %s ", PlayerName);
	 }
	 if (player.rank == rank)
	 {
		  System.out.printf(" ����� \n");
	 }
}
	





}