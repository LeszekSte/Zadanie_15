import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class InputData {


    public List readData() throws IOException {
        List<Order> orders = new ArrayList<>();


        FileReader fileReader=null;
         try{
             fileReader = new FileReader("orders.csv");
         }  catch (FileNotFoundException e){
             e.printStackTrace();
         }


        BufferedReader buffRead = new BufferedReader(fileReader);
        String line = null;

        while ((line=buffRead.readLine()) !=null){
            String[] split = line.split(";");
            orders.add(new Order(Integer.valueOf(split[0]),split[1],Double.valueOf(split[2]),OrderType.valueOf(split[3])));
        }
        buffRead.close();
        return orders;
    }
}
