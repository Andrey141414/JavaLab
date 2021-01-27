import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
	
	Chess_figure a = new Chess_figure("Ladya",5);
	Chess_figure b = new Chess_figure("Slon");
	Chess_figure c = new Chess_figure();
	


	a.Display();
	b.Display();
	c.Display();
	
	int N = 5;
	Chess_figure[] MAS = new Chess_figure[N];
	
for (int i=0;i<N;i++)
{
Chess_figure buff = new Chess_figure("Ladya");
MAS[i] = buff;
}

MAS[1].value = 4;

System.out.printf("\n\nMassive\n\n");


for(int i=0;i<N;i++)
{
MAS[i].Display();
}
	
}
}



