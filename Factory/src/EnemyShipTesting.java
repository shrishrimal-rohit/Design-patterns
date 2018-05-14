import java.util.Scanner;

public class EnemyShipTesting {



    public static void main(String [] args){
        EnemyShip enemyShip = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ship u want to create as U/R?");
        String str = sc.nextLine();

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        enemyShip = enemyShipFactory.EnemyShipFactory1(str);

        doStuffEnemy(enemyShip);


    }


    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.showEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }


}
