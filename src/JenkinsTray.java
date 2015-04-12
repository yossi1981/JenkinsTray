import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.*;

public class JenkinsTray {

    public static void main(String[] args){
        try {
            JenkinsFetcher jf = new JenkinsFetcher();
            jf.Start();



        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
