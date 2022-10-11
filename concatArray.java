public class concatArray{
public static void main(String[] args) {
    int[] part1 = {0,1,2,3,4};
    int[] part2 = {5,6,7,8,9};
    int[] test = concatArray(part1, part2);
    String forTest = "";
    for (int y =0; y<test.length; y++){
      if(y != test.length-1){
        forTest += (test[y] + ", ");
      }
      else {forTest += test[y];}
    }
    System.out.println("{" + forTest + "}");
  }

 public static int[] concatArray(int[]ary1,int[]ary2){
    int[] concat = new int[ary1.length+ary2.length];
    int a=0;
    for (int i = 0; i<ary1.length; i++){
      concat[i] = ary1[i];
      a++;
    }
    for (int x = 0; x<ary2.length; x++){
      concat[a] = ary2[x];
      a++;
    }
    return concat;
  }
}
