package Bai2;

import java.io.*;

public class TestIOText {
    public static void main(String[] args) {

        String[] arraySong = {"Hello califonia", "We don’t talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};

        String fileName = "list_song.txt";


        //sử dụng FileWriter


            try {
                FileWriter fileWriter = new FileWriter(fileName);

                for (String song : arraySong) {
                    fileWriter.write(song);
                    fileWriter.write("\n");
                }

                fileWriter.close();
                System.out.println("Dữ liệu đã được ghi vào tệp");
            } catch (IOException e) {
                System.out.println("Dữ liệu chưa được ghi vào file");
                e.printStackTrace();
            }


        //sử dụng FileReader
        
            try {
                FileReader fileReader = new FileReader(fileName);
                int character;

                while ((character = fileReader.read()) != -1) {
                    System.out.print((char) character);
                }
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        //sử dụng BufferWriter
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (String song : arraySong) {
                bufferedWriter.write(song);
                 bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            System.out.println("Dữ liệu đã được ghi vào file");
        } catch (IOException e) {
            System.out.println("Dữ liệu chưa được ghi vào file");
            //chẩn đoán ngoại lệ
            e.printStackTrace();
        }
        //sử dụng BufferReader
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            //chẩn đoán ngoại lệ
            e.printStackTrace();
        }
    }

}

