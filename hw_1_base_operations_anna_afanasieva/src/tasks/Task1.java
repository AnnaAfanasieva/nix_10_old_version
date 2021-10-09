public class Task1 {

    private static int sumOfDigits(String string){
        char[] charSet = string.toCharArray();
        int counter = 0;
        for(int i=0; i<charSet.length; i++){
            if(Character.isDigit(charSet[i])){
                counter += Character.getNumericValue(charSet[i]);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String string = "fd15636i01";
        int sumOfDigits = sumOfDigits(string);
        System.out.println(sumOfDigits);

    }
}
