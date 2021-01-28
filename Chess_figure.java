import java.util.Scanner;
public class Chess_figure{
private String[] NAMES = {"Iaoea","Eiiu", "Neii", "Eaauy", "Oa?cu"};


public String name;
public int value;
public boolean pawn;


public Chess_figure(String name,int value)
{
this.name = name;
this.value = value;
}

public Chess_figure(String name)
{
this.name = name;
value = 3;
}



public void Display(){

System.out.printf(" %s  Oaiiinou - ",name);
System.out.println(value);
}





}