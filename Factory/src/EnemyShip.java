public  abstract  class  EnemyShip {


    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void showEnemyShip(){
        System.out.println("hii there this is " +getName());
    }
    public void followHeroShip(){
        System.out.println(getName()+"is following hero ship");
    }


    public void enemyShipShoots(){
        System.out.println(getName()+"attacks & does damage of " +getDamage());
    }

}
