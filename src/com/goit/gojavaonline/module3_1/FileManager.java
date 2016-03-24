package com.goit.gojavaonline.module3_1;

import java.util.List;

public class FileManager {
    public static final int FILES_COUNT = 3;
    public static void main(String[] args){
        int filesCount = getFilesCount(args);

        Directory directory = new Directory("testDirectory");
        for(int i = 0; i < filesCount; i++){
            directory.addFile(FileFactory.createAudioFile("myTestAudioFile_"+i+"_.mp3"));
            directory.addFile(FileFactory.createTextFile("myTestTextFile_"+i+"_.txt"));
            directory.addFile(FileFactory.createGraphicFile("myTestGraphicFile_"+i+"_.png"));
        }

        printDirectory(directory);

        directory.removeFile( directory.getFileByName("myTestTextFile_"+filesCount+"_.txt")); //ERROR

        directory.removeFile( directory.getFileByName("myTestAudioFile_"+(filesCount-1)+"_.mp3"));

        printDirectory(directory);

        List<File> files = directory.getFiles();
        for (File file : files) {
            file.write(new Object());
            file.read();
        }


    }

    private static int getFilesCount(String[] args){ //code duplicated in several classes
        int filesCount;                              //class ElementsCountUtility created with method public static int getElementCount(String[] args, final int defaultElementsCount).
        if(args != null && args.length != 0){
            String filesCountValue = args[0];
            try {
                filesCount = Integer.parseInt(filesCountValue);
                if(filesCount <= 0){
                    System.out.println("Program argument should be positive integer value. Using default value "+ FILES_COUNT);
                    filesCount = FILES_COUNT;
                }
            } catch (NumberFormatException e) {
                System.out.println("Specified program argument is not an integer value. Using default value "+ FILES_COUNT);
                filesCount = FILES_COUNT;
            }
        } else {
            filesCount = FILES_COUNT;
        }
        return filesCount;
    }

    private static void printDirectory(Directory directory){
        if(directory != null){
            System.out.println(directory.toString());
        }
    }
}
