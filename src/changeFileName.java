import java.io.File;
import java.nio.file.Files;

public class changeFileName {
    public static void main(String[] args) {
        File file = new File("E:\\Postgraduate\\Python\\Practice\\数据算法与结构\\Java\\src");
//        System.out.println(file.list().toString());
        File[] files = file.listFiles();
        for (File f : files) {
            String filename= f.getName();
            if (filename.contains("jianzhi")){
                String a =  filename.replace("jianzhi","");
                if (a.startsWith("_")){
                    a = a.replace("_","");}
                System.out.println(a);

            }
//            System.out.println(filename);
        }


    }
}
