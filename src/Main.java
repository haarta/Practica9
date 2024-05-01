import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void zad1(Scanner sc){
        System.out.println("Введите число с клавиатуры..");
        try{
            int number = sc.nextInt();
            System.out.println(number);
        } catch (InputMismatchException exception){
            System.out.println("Ошибка! Нужно ввести число!");
        }
    }

    public static void zad2(){
        File f1 = new File("C:\\Users\\1\\IdeaProjects\\");
        File[] arr = f1.listFiles();
        for(File el : arr){
            System.out.println(el);
        }
    }

    public static void zad3() throws Exception{
        Path path = Path.of("s.txt");
        List<String> list = Files.readAllLines(path);
        for (String el : list){
            System.out.println(el);
        }
    }

    public static void zad4() { //в папке проекта файлик с текстом,изменить название надо + почему именно такое исключение в задании указано

        String str = "s.txt";
        try {
        FileReader fr = new FileReader(str);
        Scanner sc1 = new Scanner(fr);
        while (sc1.hasNextLine()){
            System.out.println(sc1.nextLine());
        }
        } catch (FileNotFoundException exception){
            System.out.println("Файл не существует!");
        }
    }


    public static void zad5() throws Exception{
        String str = "\nJava - строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems";
        Path path = Path.of("s.txt");
        Files.write(path,str.getBytes(), StandardOpenOption.APPEND);
        List<String> list = Files.readAllLines(path);
        for (String el : list){
            System.out.println(el);
        }
    }



    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //zad1(sc);
        //zad2();
        //zad3();
        //zad4();
        //zad5();




    }
}