public class returnCopy {
public static void main(String[] args) {
    int[] x = {1,5,6,9,8,6,5,4};
    int[] z = returnCopy(x);
    String arrayX = "";
    String arrayZ = "";
    System.out.println(returnCopy(x) == x);
    for (int i=0; i<x.length; i++) {
      if(i != x.length-1) {
        arrayX += (x[i] + ", ");
      }
      else {arrayX += x[i];}
    }
    System.out.println("{" + arrayX + "}");
    for (int i=0; i<z.length; i++) {
      if(i != z.length-1) {
        arrayZ += z[i] + ", ";
      }
      else {arrayZ += z[i];}
  }
  System.out.println("{" + arrayZ + "}");
}
public static int[] returnCopy(int[] array) {
  int[] copy = new int[array.length];
  for (int i=0; i<array.length;i++) {
    copy[i] = array[i];
  }
  return copy;
}
}
