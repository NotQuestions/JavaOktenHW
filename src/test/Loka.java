package test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Loka {
    public static void main(String[] args) throws IOException {
        Stream<String> str = Files.lines(Paths.get("D://text1.txt"));
        Map<String, Integer> s1 = getList(str);
        for (String s : s1.keySet()) {
            System.out.print("#"+s+" ");
        }
    }

    public static HashMap<String, Integer> getList(Stream<String> str) {
        HashMap<String, Integer> list = new HashMap<>();
        str.forEach((String a) ->{
            String a2 = a.replace(" ","");
            for (String s : a2.split("#")) {
                list.put(s,1);
            }
        });
        return  list;
        }
    }
