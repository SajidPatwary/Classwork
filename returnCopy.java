public class returnCopy {
public static void main(String[] args) {
    int[] x = {1,2,3};
    int[] z = returnCopy(x);
    int count = 0;
    System.out.println(returnCopy(x) == x);
    for (int y =0; y<x.length;y++) {
      if (z[y] == x[y]) {
        count++;
      }
    }
    if (count == x.length) {
      System.out.print("true");
    }
  }
public static int[] returnCopy(int[] array) {
  int[] copy = new int[array.length];
  for (int i=0; i<array.length;i++) {
    copy[i] = array[i];
  }
  return copy;
}
}
