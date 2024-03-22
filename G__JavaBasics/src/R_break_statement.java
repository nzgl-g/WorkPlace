public class R_break_statement {
    public static void main(String[] args) {
        //section of unlabeled break
        int[] arrayofint=
                { 32, 87, 3, 589,
                        12, 1076, 20,
                        8, 622, 127 };
        boolean foundIt=false;
        int searchFor=12;
        int i;
        for (i=0;i<arrayofint.length;i++){
            if (arrayofint[i]==searchFor){
                foundIt=true;
                break;
            }
        }
        if (foundIt){
            System.out.println("Found "+searchFor+" on index "+i);
        }else {
            System.out.println("the number not founded on the list");
        }
        //section of labeled break
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int lookingFor=1076;
        int x;
        int j=0;
        boolean foundit=false;
        search:
        for (x=0;x<arrayOfInts.length;x++){
            for (j=0;j<arrayOfInts[x].length;j++){
                if (lookingFor==arrayOfInts[x][j]){
                    foundit=true;
                    break search;
                }
            }
        }
        if (foundit){
            System.out.println("found "+lookingFor+" int the row "+(x+1)+" and the column "+(j+1));
        }else {
            System.out.println("the number not founded ");
        }
    }
}
