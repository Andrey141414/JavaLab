public class Program {

	public static void main(String[] args) {
	int N = 10;
	Chess_figure[] MAS = new Chess_figure[N];
	
	
//exception(too big size of massive)
	try
	{	
		for (int i=0;i<N+1;i++)
		{
		Chess_figure buff = new Chess_figure("Ladya");
		MAS[i] = buff;
		}
	}
	  catch(ArrayIndexOutOfBoundsException e)  // исключение – выход за границу массива
  	{
  	 System.out.printf("неправильный индекс массива: " + e); // e - сообщение класса exception
  	}

}
}