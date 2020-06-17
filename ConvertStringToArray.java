public class ConvertStringToArray {
    // 8)
    public static void main(String[] args) {

        String strName = "Welcome to 123";
        strName.substring(0, 1);

        String[] ArrayStr = new String[strName.length()];

        for(int i = 0; i < strName.length(); i++){
            ArrayStr[i] = strName.substring(i, i+1);
        }
        for(String e : ArrayStr) {
            System.out.print(e+"|");
        }

       // System.out.println(strName.substring(0, 1));

        String[] strArray = strName.split(" ");

       // System.out.println(strArray[0]+" "+strArray[1]+" "+strArray[2]);
        for(String e : strArray) {
            System.out.print(e+" ");
        }

        //System.out.println(strArray[0]+" "+strArray[1]+" "+strArray[2]);


    }
}
