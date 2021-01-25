public class Program {
public void clear()
{
	for(int i=0;i<50;i++)
	{
	System.out.println();
	}
}



	public static void main(String[] args) {
	Program screen = new Program();
	String[] NAMES = {"Pawn","Knight", "Bishop", "Rook", "Queen"};
	int N = 10;
		Chess_figure[] MAS = new Chess_figure[N];

	for(int i=0;i<N;i++)
	{
		MAS[i] = new Chess_figure();
		switch (i%5)
		{
		case 0: {MAS[i].Init(1, NAMES[i % 5]); }; break;
		case 1: {MAS[i].Init(3, NAMES[i % 5]); }; break;
		case 2: {MAS[i].Init(3, NAMES[i % 5]); }; break;
		case 3: {MAS[i].Init(5, NAMES[i % 5]); }; break;
		case 4: {MAS[i].Init(9, NAMES[i % 5]); }; break;
		}
	
	}
	
	for(int i= 0;i<N;i++)
	{
	MAS[i].Display();
	}



	for(int i=0;i < N;i++)
	{
	Help a = new Help();
	MAS[i].Compare(a);

	for(int j = i+1;j < N+1;j++)
	{	
	Help b = new Help();
	MAS[j].Compare(b);
	if(a.Help_name.equalsIgnoreCase(b.Help_name))
		{
		for(int z = j;z < N-1;z++)
			{
			MAS[z]=MAS[z+1];
			}
		N-=1;
		}
	}
	} 



	screen.clear();
	for(int i= 0;i<N;i++)
	{
	MAS[i].Display();
	}



screen.clear();
Chess_Player Magnus = new Chess_Player();
	Magnus.playerInit("Magnus",N, MAS, 1);

Magnus.playerDisplay();

}
}