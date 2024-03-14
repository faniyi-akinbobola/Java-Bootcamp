public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       for(int i = 99; i > 0; i--){
        // System.out.println(i);
        Sing(i);

       }

    }
    public static void Sing(int i){
        System.out.println(i + " bottles of beer on the wall, " + i + "bottles of beer!");
        System.out.println("take one down, pass it around " +(i-1)+ ", bottles of beer on the wall!");
    }

}
// <i> bottles of beer on the wall, <i> bottles of beer!
//  *      take one down, pass it around <i-1>, bottles of beer on the wall!