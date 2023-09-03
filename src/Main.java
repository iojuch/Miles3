public class Main {

    public static void main(String[] args) {
        int amount = 200;
        int bonus = 20;
        int bonusMiles = amount / bonus;
        if (bonusMiles < 500) {
             bonusMiles = bonusMiles;
        } else {
            bonusMiles = 500;
        }
        System.out.println("Мили с покупки:" + bonusMiles);

    }
}
