import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

import javax.swing.filechooser.FileSystemView;

public class App {
    public static void main(String[] args) throws Exception {

        String fileStr = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\in.txt";
        // System.out.println((fileStr));
        File file = new File(fileStr);
        file.createNewFile();
        HashMap<String, Integer> candidates = new HashMap<>();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Alex Blue,15\n");
            bw.write("Maria Green,22\n");
            bw.write("Bob Brown,21\n");
            bw.write("Alex Blue,30\n");
            bw.write("Bob Brown,15\n");
            bw.write("Maria Green,27\n");
            bw.write("Maria Green,22\n");
            bw.write("Bob Brown,25\n");
            bw.write("Alex Blue,31\n");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        try (BufferedReader br= new BufferedReader(new FileReader(fileStr))) {
            var line = br.readLine();
            while(line != null){
                var nameVotes = line.split(",");
                var name = nameVotes[0];
                int votes = Integer.parseInt(nameVotes[1]);
                // System.out.println(line + " - " + name + " - " + votes);
                if(candidates.containsKey(name)){
                    candidates.put(name, candidates.get(name) + votes);
                }else{
                    candidates.put(name, votes);
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        for(String name : candidates.keySet()){
            System.out.printf("%s: %d\n", name, candidates.get(name));
        }
    }
}
