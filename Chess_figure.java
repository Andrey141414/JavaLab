import java.util.Scanner;
public class Chess_figure{
private String[] NAMES = {"Пешка","Конь", "Слон", "Ладья", "Ферзь"};
private String name;

public int value;
public boolean pawn;


public void Read(){

	int vibor;
	System.out.println("Название фигуры");
	for (int i = 0; i < 5; i++)
	{
		System.out.printf("%d ",i+1);
		System.out.println(NAMES[i]);

	}

	Scanner scan = new Scanner(System.in);
	vibor = scan.nextInt();

	name = NAMES[vibor - 1];
	switch (vibor)
	{
	case 1: {value = 1; pawn = true; }break;
	case 2: {value = 3; }break;
	case 3: {value = 3; }break;
	case 4: {value = 5; }break;
	case 5: {value = 9; }break;
	}
	

}

public void Init(int val,String nam){
value = val;
	name = nam;
	if (name == NAMES[0])
		pawn = true;
	else
		pawn = false;
}

public void Display(){

System.out.printf(" %s  Ценность - ",name);
System.out.println(value);
}

}