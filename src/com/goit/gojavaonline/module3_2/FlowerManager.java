package com.goit.gojavaonline.module3_2;

public class FlowerManager {
    public static final int FLOWERS_COUNT = 7;
    public static void main(String[] args){
        int flowersCount = getFlowersCount(args);

        Bouquet bouquet = new Bouquet();
        for(int i = 0; i < flowersCount; i++){
            bouquet.addFlower(FlowerFactory.getRandomFlower());
        }

        printFlowersInBouquet(bouquet);

        removeRandomFlowerFromBouquet(bouquet);
        removeRandomFlowerFromBouquet(bouquet);

        printFlowersInBouquet(bouquet);

        RoseBush roseBush = new RoseBush();

        for(int i = 0; i < flowersCount; i++){
            roseBush.addRose(new Rose(FlowerColor.RED));
        }

        System.out.println("\nRosebush contains "+ roseBush.getRoses().size() + " roses.\n");

        removeRandomRoseFromRoseBush(roseBush);
        removeRandomRoseFromRoseBush(roseBush);

        System.out.println("\nRosebush contains "+ roseBush.getRoses().size() + " roses.");
    }

    private static void removeRandomFlowerFromBouquet(Bouquet bouquet){
        Flower flower = bouquet.getFlowerByIndex((int)(Math.random()*bouquet.getFlowers().size()));

        if(flower != null){
            bouquet.removeFlower(flower);
        }
    }

    private static void removeRandomRoseFromRoseBush(RoseBush roseBush){
        Rose rose = roseBush.getRoseByIndex((int)(Math.random()*roseBush.getRoses().size()));

        if(rose != null){
            roseBush.removeRose(rose);
        }
    }

    private static int getFlowersCount(String[] args){ //code duplicated in several classes
        int flowersCount;                              //class ElementsCountUtility created with method public static int getElementCount(String[] args, final int defaultElementsCount).
        if(args != null && args.length != 0){
            String flowersCountValue = args[0];
            try {
                flowersCount = Integer.parseInt(flowersCountValue);
                if(flowersCount <= 0){
                    System.out.println("Program argument should be positive integer value. Using default value "+ FLOWERS_COUNT);
                    flowersCount = FLOWERS_COUNT;
                }
            } catch (NumberFormatException e) {
                System.out.println("Specified program argument is not an integer value. Using default value "+ FLOWERS_COUNT);
                flowersCount = FLOWERS_COUNT;
            }
        } else {
            flowersCount = FLOWERS_COUNT;
        }
        return flowersCount;
    }

    private static void printFlowersInBouquet(Bouquet bouquet){
        if (bouquet != null){
            System.out.println(bouquet.toString());
        }
    }

}
