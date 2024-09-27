import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        ProcessBuilder pd = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
        ProcessBuilder pv = new ProcessBuilder("C:\\Users\\Ermoha\\AppData\\Local\\CapCut\\Apps\\CapCut.exe");
        try {
            Process p1 = pb.start();
            System.out.println(p1.info());
            p1.destroy();
            Process p2 = pd.start();
            System.out.println(p2.info());
            p2.destroy();
            Process p3 = pv.start();
            System.out.println(p3.info());
            p3.destroy();
        } catch(IOException e) {System.out.println(e.getMessage());}
    }
}