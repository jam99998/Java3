package Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class DZ_3 {

//    №1
    public static void main(String[] args) throws IOException {
        try(FileInputStream rr = new FileInputStream ("src/Lesson_3/read/som.txt")) {

            int x;
            while ((x=rr.read()) != -1){
                System.out.print((char) x);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

////    №2
//        ArrayList<InputStream> ali = new ArrayList<>();
//        ali.add(new FileInputStream("src/Lesson_3/read/11.txt"));
//        ali.add(new FileInputStream("src/Lesson_3/read/som.txt"));
//        ali.add(new FileInputStream("src/Lesson_3/read/34.txt"));
//
//        SequenceInputStream in = new SequenceInputStream (Collections.enumeration(ali));
//
//        int x;
//
//        while ((x = in.read()) !=-1){
//            System.out.print((char) x);
//        }
//        in.close();




//    №3
//
//long t = System.currentTimeMillis();
//        try(RandomAccessFile raf = new RandomAccessFile("src/Lesson_3/read/33.txt","r")){
//            raf.seek(0);
//
//            int x;
//            byte[] arr = new byte [6700];
//            for (int j = raf.read(arr); j<7000; j++) {
//                for (int i = 0; i <1800 ; i++) {
//                    System.out.print((char) raf.read());
//                }
//            }
//            System.out.println(System.currentTimeMillis()-t);
//
//        }
   }





}
