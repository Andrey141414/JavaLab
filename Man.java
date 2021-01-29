import java.util.Scanner;
public class Man extends Chess_Player{

public int numOfParties;

//Peregruzka metoda
public void test(int a)
{
System.out.printf("SubClass\n");
}


public String toString(int a) 
{
numOfParties = a;
return "\nName - " + PlayerName + "\nNumbers of figures is " + numbers  + "\nRank - " + rank + "\nParties -" + numOfParties;
}



public Man(int num){
//Вызов конструктора из супер класса
super();
numOfParties = num;
}



}