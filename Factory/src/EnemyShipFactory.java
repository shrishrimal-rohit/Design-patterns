public class EnemyShipFactory {

    public EnemyShip EnemyShipFactory1(String enemy) {


        if (enemy.equals("U")) {
            return new UFOEnemyShip();
        } else if (enemy.equals("R")) {
            return new RocketEnemyShip();
        }


        return null;
    }
}
