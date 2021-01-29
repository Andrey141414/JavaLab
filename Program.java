public class Program {

	public static void main(String[] args) {
	
Chess_Player player = new Chess_Player();
Man man = new Man(100);

int a = 1 ;
//subclassfunc
man.test(a);
//Superclass func
man.test();

System.out.printf("%s",player.toString());



	Chess_Player cp = new Chess_Player();
	Football_Player fp =  new Football_Player();
	BOX_Player bp= new BOX_Player();
	cp.training();
	fp.training();
	bp.training();




System.out.printf("\n\n realisation of interfece Done, method (Win) n\");

cp.win();
fp.win();
bp.win();




}
}