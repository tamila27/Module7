package com.goit.gojavaonline.module3_3;

public class MusicalShopManager {
    public static final int MUSICAL_INSTRUMENTS_COUNT = 5;

    public static void main(String[] args){
        MusicalShop musicalShop = new MusicalShop();
        int musicalInstrumentsSetCount = getMusicalInstrumentsCount(args);
        for(int i = 0; i < musicalInstrumentsSetCount; i++){
            musicalShop.receiveMusicalInstrument(MusicalInstrumentFactory.getRandomMusicalInstrument());
        }

        printMusicalShopsInstruments(musicalShop);

        sellRandomMusicalInstrumenntFromShop(musicalShop);
        sellRandomMusicalInstrumenntFromShop(musicalShop);
        sellRandomMusicalInstrumenntFromShop(musicalShop);

        printMusicalShopsInstruments(musicalShop);

    }
    private static int getMusicalInstrumentsCount(String[] args){ //code duplicated in several classes
        int musicalInstrumentsCount;                              //class ElementsCountUtility created with method public static int getElementCount(String[] args, final int defaultElementsCount).
        if(args != null && args.length != 0){
            String musicalInstrumentsCountValue = args[0];
            try {
                musicalInstrumentsCount = Integer.parseInt(musicalInstrumentsCountValue);
                if(musicalInstrumentsCount <= 0){
                    System.out.println("Program argument should be positive integer value. Using default value "+ MUSICAL_INSTRUMENTS_COUNT);
                    musicalInstrumentsCount = MUSICAL_INSTRUMENTS_COUNT;
                }
            } catch (NumberFormatException e) {
                System.out.println("Specified program argument is not an integer value. Using default value "+ MUSICAL_INSTRUMENTS_COUNT);
                musicalInstrumentsCount = MUSICAL_INSTRUMENTS_COUNT;
            }
        } else {
            musicalInstrumentsCount = MUSICAL_INSTRUMENTS_COUNT;
        }
        return musicalInstrumentsCount;
    }

    private static void printMusicalShopsInstruments(MusicalShop musicalShop){
        if (musicalShop != null){
            System.out.println(musicalShop.toString());
        }
    }

    private static void sellRandomMusicalInstrumenntFromShop(MusicalShop musicalShop){
        MusicalInstrument musicalInstrument = musicalShop.getMusicalInstrumentByIndex((int)(Math.random()*musicalShop.getMusicalInstruments().size()));

        if(musicalInstrument != null){
            musicalShop.sellMusicalInstrument(musicalInstrument);
        }
    }
}
