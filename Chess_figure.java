import java.util.Scanner;
public class Chess_figure{

private String name;

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

public Chess_figure()
{
this.name = "King";
this.value = 10;
}

public void Display(){

System.out.printf(" %s  Value - ",name);
System.out.println(value);
}





}