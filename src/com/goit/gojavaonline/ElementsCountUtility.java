package com.goit.gojavaonline;

public class ElementsCountUtility {
    public static int getElementCount(String[] args, final int defaultElementsCount){
        int elementsCount;
        if(args != null && args.length != 0){
            String elementsCountValue = args[0];
            try {
                elementsCount = Integer.parseInt(elementsCountValue);
                if(elementsCount <= 0){
                    System.out.println("Program argument should be positive integer value. Using default value "+ defaultElementsCount);
                    elementsCount = defaultElementsCount;
                }
            } catch (NumberFormatException e) {
                System.out.println("Specified program argument is not an integer value. Using default value "+ defaultElementsCount);
                elementsCount = defaultElementsCount;
            }
        } else {
            elementsCount = defaultElementsCount;
        }
        return elementsCount;
    }
}
