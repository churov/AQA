package lesson7;

import java.io.FileWriter;
import java.io.IOException;

public class Lesson7 {
    public static void main(String[] args)  {

            generateCsvFile("C:\\Users\\anduser\\Desktop\\test.csv");
        }

        private static void generateCsvFile (String sFileName)
        {
            try {
                FileWriter writer = new FileWriter(sFileName);

                writer.append("Value1");
                writer.append(';');
                writer.append(" 100");
                writer.append(';');
                writer.append(" 300");
                writer.append('\n');

                writer.append("Value2");
                writer.append(';');
                writer.append(" 200");
                writer.append(';');
                writer.append(" 400");
                writer.append('\n');

                writer.append("Value3");
                writer.append(';');
                writer.append(" 123");
                writer.append(';');
                writer.append(" 500");
                writer.append('\n');


                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
