public class Program {

	public static void main(String[] args) {
	
	int N = 2;
	int M = 8;
	Chess_figure[][] MAS = new Chess_figure[N][M];
	for (int i = 0; i < M; i++)
	{
		Chess_figure a = new Chess_figure("Pawn");
		MAS[1][i] = a;
	}
	
	MAS[0][0] = new Chess_figure("Ladya");
	MAS[0][1] = new Chess_figure("Kon");
	MAS[0][2] = new Chess_figure("Slon");
	MAS[0][3] = new Chess_figure("Queen");
	MAS[0][4] = new Chess_figure("King");
	MAS[0][5] = new Chess_figure("Slon");
	MAS[0][6] = new Chess_figure("Kon");
	MAS[0][7] = new Chess_figure("Ladya");

	for(int i=0;i<N;i++)
	{
		for(int j=0;j<M;j++)
		{
		System.out.printf("%s\t",MAS[i][j].name);
		}
	System.out.printf("\n");
	}

}
}