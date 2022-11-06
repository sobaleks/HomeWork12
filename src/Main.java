import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        String dlinnoeSlovo;
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/aleksandr/Загрузки/romeo-and-juliet.txt");
            StringBuilder romeoAndJuliet = new StringBuilder();
            int i = -1;
            while ((i = fileInputStream.read()) != -1) {
                romeoAndJuliet.append((char) i);
            }
            fileInputStream.close();
            String slovo = romeoAndJuliet + " ";
            String[] slo = slovo.split("[^A-z]");
            for (String e : slo) {
            }
            dlinnoeSlovo = slo[0];
            for (int j = 0; j < slo.length; j++) {
                if (dlinnoeSlovo.length() < slo[j].length()) {
                    dlinnoeSlovo = slo[j];
                }
            }
            System.out.println(dlinnoeSlovo);
            FileOutputStream fileOutputStream = new FileOutputStream("/home/aleksandr/Загрузки/slovo.txt");
            byte[] buffer = dlinnoeSlovo.getBytes();
            fileOutputStream.write(buffer);
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println("Файл не найден");
        }
    }
}