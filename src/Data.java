import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = new Date();

        System.out.println(sdf1.format(d));
    }
}

