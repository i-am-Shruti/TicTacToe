package player;

import java.util.Scanner;

public class Player {
private String name;
private char symbol;
private String address;
private String contactNum;
private String emailId;
private int age;

public void setPlayersDetails(String name, char symbol, String address, String contactNum, String emailId, int age){
    this.name= name;
    this.symbol= symbol;
    this.address= address;
    this.contactNum= contactNum;
    this.emailId= emailId;
    this.age= age;
}
public void setPlayerNameAndAge(String name, int age){
this.name= name;
this.age= age;
}
public void setPlayerNameSymbolEmailIdAge(String name, char symbol,String emailId, int age){
this.name= name;
this.symbol = symbol;
this.emailId = emailId;
this.age = age;
}
public void setPlayerNameAndSymbol(String name, char symbol){
  this.name= name;
  this.symbol= symbol;
}
public String getPlayerName(){
return this.name;
}
public char getPlayerSymbol(){
return this.symbol;
}
public void getPlayerNameAndAge(){
   System.out.println("Player Name:" +this.name);
   System.out.println("Player age:"+ this.age);
}
public void changeSymbol(char symbol){
      this.symbol= symbol;
}
public void getPlayerNameAndSymbol(){
  System.out.println("Player Name:"+this.name);
  System.out.println("Player Symbol:"+this.symbol);
}
public void getPlayersDetails(){
    System.out.println("Player Name:" +this.name);
    System.out.println("Player Symbol:" +this.symbol);
    System.out.println("Player emailId:" +this.emailId);
    System.out.println("Player age:" +this.age);
    System.out.println("Player contactNum:" +this.contactNum);
    System.out.println("Player address:" +this.address);
    System.out.print("\n");
}

public  Player setPlayerDetailsFromUserInput (Player p){
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the  player details:");
          System.out.println("Enter the  player name:");
          String name= scn.nextLine();
          System.out.println("Player Symbol:");
          char symbol=scn.next().charAt(0);
          System.out.println("Enter the  player address:");
          String address= scn.nextLine();
          System.out.println("Enter the  player contact num:");
          String contactNum= scn.nextLine();
          System.out.println("Enter the  player emailId:");
          String emailId= scn.nextLine();
          System.out.println("Enter the  player age:");
          int age = scn.nextInt();  
          System.out.println("\n");
          p.setPlayersDetails(name,symbol, address, contactNum, emailId,age);
                }

}
