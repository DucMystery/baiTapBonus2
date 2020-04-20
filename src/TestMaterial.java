

public class TestMaterial {


    public static void main(String[] args) {
        BotChienGion botChienGion1 = new BotChienGion("TS01", "D11", 200, 100, 28, 2, 2013);
        BotChienGion botChienGion2 = new BotChienGion("TS02", "D12", 200, 150, 29, 2, 2000);
        Meat meat1 = new Meat("M01", "beef", 1000, 1, 200, 17, 1, 2020);
        Meat meat2 = new Meat("M02", "pork", 1000, 1, 120, 19, 4, 2020);
        Meat meat3 = new Meat("M03", "horse", 1000, 1, 300, 31, 1, 2020);

        Material[] materials = new Material[5];
        materials = new Material[]{botChienGion1, botChienGion2, meat1, meat2, meat3};
        for (Material material : materials) {
            if (material instanceof BotChienGion) {
                material = (BotChienGion) material;
                System.out.println("Name : " + material.name);
                System.out.println("NSX: " + ((BotChienGion) material).day + "/" + ((BotChienGion) material).month + "/" + ((BotChienGion) material).year);
                System.out.println("HSD : " + material.dateOfManufacture());
                System.out.println("Discount : " + ((BotChienGion) material).CalculatorDiscount(0.05) + " $");
            } else if (material instanceof Meat) {
                material = (Meat) material;
                System.out.println("Name : " + material.name);
                System.out.println("NSX: " + ((Meat) material).day + "/" + ((Meat) material).month + "/" + ((Meat) material).year);
                System.out.println("HSD : " + material.dateOfManufacture());
                System.out.println("Discount : " + ((Meat) material).CalculatorDiscount(0.1) + " $");
            }
        }
    }
}
