package game;

import player.Player;
import board.Board;
import java.util.*;

public class Game {
Player[] players;
Board board;
int turn;
int noOfMoves;
boolean gameOver;
String zero;
String cross;

public Game(Player[]players, Board board){
    this.players= players;
    this.board= board;
    this.turn=0;
    this.noOfMoves=0;
    this.gameOver=false;

    StringBuilder z = new StringBuilder();
    StringBuilder c = new StringBuilder();

    for(int i=0;i<board.size;i++){
        z.append('O');
        c.append('X');
    }

    this.zero=z.toString();
    this.cross=c.toString();
}

public void printBoardConfig(){
    int n = this.board.size;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(board.matrix[i][j]+" ");
        }
        System.out.println();
    }
}

public void play(){
    printBoardConfig();
          int n = board.size;
     while(!gameOver){
        noOfMoves++;
        int idx = getIdx();
        int row = idx/n;
        int col = idx%n;
        board.matrix[row][col]=players[turn].getPlayerSymbol();

        if(noOfMoves>=n*n){
            System.out.println("Game draw");
            return;   
        }
        if(noOfMoves>=2*n-1 && checkCombination()==true){
            gameOver= true;
            printBoardConfig();
            System.out.println("winner is:"+players[turn].getPlayerName());
            return;
        }
        turn =(turn+1)%2;
        printBoardConfig();
     }
}

public int getIdx(){
    while(true){
        System.out.println(("Player: "+players[turn].getPlayerName()+" give One position"));
        Scanner scn = new Scanner(System.in);
        int pos = scn.nextInt()-1;

        int n = board.size;
        int row = pos/n;
        int col = pos%n;

        if(row<0|| row>=n||col<0||col>=n){
            System.out.println("Invalid position");
            continue;
        }
        if(board.matrix[row][col]!='-'){
            System.out.println("position already occupied");
            continue;
        }
        return pos;
    }
}

public boolean checkCombination(){
          int n = board.size;
  //RoWise
    for(int i=0;i<n;i++){
        StringBuilder sb = new StringBuilder();
        for(int j =0;j<n ;j++){
            sb.append(board.matrix[i][j]);
        }

        String pattern= sb.toString();
        if(pattern.equals(zero) || pattern.equals(cross)){
            return true;
        }
    }
//columnWise
for(int i=0;i<n;i++){
        StringBuilder sb = new StringBuilder();
        for(int j =0;j<n ;j++){
            sb.append(board.matrix[j][i]);
        }

        String pattern= sb.toString();
        if(pattern.equals(zero) || pattern.equals(cross)){
            return true;
        }
    }
    //Diagonal
    int i =0,j=0;
            StringBuilder sb = new StringBuilder();
            while(i<n){
                sb.append(board.matrix[i][j]);
                i++;
                j++;
            }
    
            String pattern= sb.toString();
            if(pattern.equals(zero) || pattern.equals(cross)){
                return true;
            }
        //AntiDiagonal
        
         i =0;
         j=n-1;
                   sb = new StringBuilder();
                    while(i<n){
                        sb.append(board.matrix[i][j]);
                        i++;
                        j--;
                    }
            
                     pattern= sb.toString();
                    if(pattern.equals(zero) || pattern.equals(cross)){
                        return true;
                    }

    return false;
}
}
