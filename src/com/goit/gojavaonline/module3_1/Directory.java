package com.goit.gojavaonline.module3_1;

import com.goit.gojavaonline.PrintUtility;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;

    public Directory(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) { //this method is never used
        this.files = files;
    }

    public boolean isFileNameAlreadyExist(String name) {
        boolean alreadyExists = false;
        if (!isDirectoryEmpty()) {
            for (File file : files) {
                if (file.getName().equals(name)) {
                    alreadyExists = true;
                    break;
                }
            }
        }
        return alreadyExists;
    }

    public boolean isFileExist(File file) {
        if (!isDirectoryEmpty()) {
            for (File fileInDirectory : files) {
                if (file.equals(fileInDirectory)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addFile(File file) {
        if (isDirectoryEmpty())
            files = new ArrayList<File>(); // files = new ArrayList<>();

        if ( !isFileNameAlreadyExist(file.getName())) {
            files.add(file);
        }
    }

    public void removeFile(File file) {
        if (file != null && !isDirectoryEmpty() && isFileExist(file)) {
            files.remove(file);
            System.out.println("File "+file.getName()+" has been successfully deleted");
        }
    }

    public File getFileByName(String name) {
        if (!isDirectoryEmpty()) {
            for (File file : files) {
                if (file.getName().equals(name)) {
                    return file;
                }
            }
        }
        System.out.println("ERROR! File " + name + " does not exist");
        return null;
    }

    public boolean isDirectoryEmpty(){
        boolean isEmpty = false;

        if(files == null || files.size() == 0){
            isEmpty = true;
        }

        return isEmpty;
    }

    @Override
    public String toString(){
        // interface Printable, class PrintUtility are created. In comment down below there are code that will replace
        // old code in toString() method in the classes Bouquet, Directory, MusicalShop
        String listOfFiles = "\nDirectory "+getName() +" contains files: \n";
        if(!isDirectoryEmpty()){
            for(File file : files){
                listOfFiles += file.getName()+"\n";
            }
        }
        return listOfFiles;

        /*StringBuilder stringBuilder = new StringBuilder("\nDirectory contains files: \n");
        stringBuilder.append(PrintUtility.listToString(files).toString());
        return stringBuilder.toString();*/
    }

}
