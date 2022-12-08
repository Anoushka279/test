import java.io.*;

// Main class
import java.util.Random;
public class Main {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[36m";

    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[36m";

    // Main driver method
    public static void main(String[] args)
    { int n = (int)(Math.random() * 5);
        if (n==0){
        System.out.println("0");}
        else if (n==1){
            System.out.println("1");}
        else if (n==2){
            System.out.println("2");}
        else if (n==3){
            System.out.println("3");}
        else if (n==4){
            System.out.println("4");}

    }
}
/** GAMEMASTER********************************************************************************************
 * displayer.display(navalBattle.getPlayerGrid(0)+"\n\n");
 *         displayer.display(navalBattle.getEnemyGrid(1)+"\n");
 *         displayer.display("Enter a negative or higher than 15 value to quit\n");
 *         try {
 *             displayer.display("\nEnter the NAME : ");
 *             String boat = scan.nextLine();
 *             String B="B";
 *             String C="C";
 *             String D="D";
 *             String S="S";
 *
 *             if (boat.equals(B)){
 *                 displayer.display("\nYou chose to fire with Battleship\n");
 *                 displayer.display("\nEnter the target column : ");
 *                 int col = scan.nextInt();
 *                 displayer.display("\nEnter the target line : ");
 *                 int line = scan.nextInt();
 *                 if (navalBattle.firebattlship(1, col-1, line-1)) {
 *                     displayer.display("HIT :D !\n");
 *                 } else {
 *                     displayer.display("miss :( \n");
 *                 }
 *             } else if (boat.equals(C)) {
 *                 displayer.display("\nYou chose to fire with Cruiser\n");
 *                 displayer.display("\nEnter the target column : ");
 *                 int col = scan.nextInt();
 *                 displayer.display("\nEnter the target line : ");
 *                 int line = scan.nextInt();
 *                 if (navalBattle.fireCruiser(1, col-1, line-1)) {
 *                     displayer.display("HIT :D !\n");
 *                 } else {
 *                     displayer.display("miss :( \n");
 *                 }
 *             }else if (boat.equals(D)) {
 *                 displayer.display("\nYou chose to fire with Destroyer\n");
 *                 displayer.display("\nEnter the target column : ");
 *                 int col = scan.nextInt();
 *                 displayer.display("\nEnter the target line : ");
 *                 int line = scan.nextInt();
 *                 if (navalBattle.fire(1, col-1, line-1)) {
 *                     displayer.display("HIT :D !\n");
 *                 } else {
 *                     displayer.display("miss :( \n");
 *                 }
 *             }else if (boat.equals(S)) {
 *                 displayer.display("\nYou chose to fire with Submarine\n");
 *                 displayer.display("\nEnter the target column : ");
 *                 int col = scan.nextInt();
 *                 displayer.display("\nEnter the target line : ");
 *                 int line = scan.nextInt();
 *                 if (navalBattle.fire(1, col-1, line-1)) {
 *                     displayer.display("HIT :D !\n");
 *                 } else {
 *                     displayer.display("miss :( \n");
 *                 }
 *             }
 *
 *         } catch (IndexOutOfBoundsException e) {
 *             displayer.display("\nYou quit the game\n");
 *             return true;
 *         }
 *         return false;
 *
 *
 *         PLAYERGRID*************************************************************+*******************************
 *         public boolean fireb(int l, int c) {
 *         if ((mat[l][c] == "|B") || (mat[l][c] == "|C") || (mat[l][c] == "|D") || (mat[l][c] == "|S")) {
 *             int n = (int)(Math.random() * 2);
 *             if (n==0){
 *                 for (c=0;c<9;c++){
 *                     mat[l][c]="|X";}}
 *             else if (n==1){
 *                 for (l=c;l<9;l++){
 *                     mat[l][c]="|X";}}
 *
 *             return true;
 *         }
 *         for (c=0;c<9;c++){
 *             mat[l][c]="|O";}
 *         return false;}
 *     public boolean firec(int l, int c) {
 *         if ((mat[l][c] == "|B") || (mat[l][c] == "|C") || (mat[l][c] == "|D") || (mat[l][c] == "|S")) {
 *             for (l=0;l<4;c++){
 *                 mat[l][c]="|X";}
 *             return true;
 *         }
 *         for (c=0;c<4;c++){
 *             mat[l][c]="|O";}
 *         return false;}
 *
 *         GAME******************************************************************************************************
 *          public boolean firebattlship(int gridInd, int targCol, int targLine) {//gridInd permet d'appeler l'indice de l'element du tableau
 *         if (gridPlayer[gridInd].fireb(targLine,targCol)) {
 *             gridEnemy[gridInd].update(targLine,targCol,"|X");//call the method update and add X if ship hit
 *             return true;
 *         }
 *         gridEnemy[gridInd].update(targLine,targCol,"|O");//update with 0 if no ship hit
 *         return false;
 *     }
 *     public boolean fireCruiser(int gridInd, int targCol, int targLine) {//gridInd permet d'appeler l'indice de l'element du tableau
 *         if (gridPlayer[gridInd].firec(targLine,targCol)) {
 *             gridEnemy[gridInd].update(targLine,targCol,"|X");//call the method update and add X if ship hit
 *             return true;
 *         }
 *         gridEnemy[gridInd].update(targLine,targCol,"|O");//update with 0 if no ship hit
 *         return false;
 *     }
 *
 *
 */