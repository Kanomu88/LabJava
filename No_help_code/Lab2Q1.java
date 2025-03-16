package No_help_code;
import java.util.Scanner; 

public class Lab2Q1 {
    private static String[] strmon = {
        "January", "February", "March", "April", "May", "June",
"July", "August", "September", "October", "November",
"December"};
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        // รับน้ำหนักของนักเรียน 4 คน
        double weight1 = myObj.nextDouble();
        double weight2 = myObj.nextDouble();
        double weight3 = myObj.nextDouble();
        double weight4 = myObj.nextDouble();
        
        // รับส่วนสูงของนักเรียน 4 คน
        double height1 = myObj.nextDouble();
        double height2 = myObj.nextDouble();
        double height3 = myObj.nextDouble();
        double height4 = myObj.nextDouble();
        
        // คำนวณค่าเฉลี่ย
        double avgWeight = (weight1 + weight2 + weight3 + weight4) / 4;
        double avgHeight = (height1 + height2 + height3 + height4) / 4;
        
        // แสดงผลลัพธ์
        System.out.printf("The average weight is %.3f kg.\n", avgWeight);
        System.out.printf("The average height is %.3f cm.\n", avgHeight);
        
        // ปิด Scanner
        myObj.close();
    }
}
