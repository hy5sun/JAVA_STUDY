public class Casting {

   public static void main(String[] args) {
      double a = 1.1;
      double b = 1;
      //double b2 = (double)1; 도 가능
      
      System.out.println(b);
      
      double d = 1.1;
      int e = (int)1.1; //강제 double -> int 로 변환
      System.out.println(e);
      
      //int to String
      String f = Integer.toString(1);
      System.out.println(f.getClass());

   }
 
}