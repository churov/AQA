package lesson_6;

public class Converter {
    public static int strConverter(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (strArray.length!=4) throw new MyArraySizeException();

        for (int i = 0;strArray.length>i; i++) {

            if (strArray[i].length!=4) throw new MyArraySizeException();

            for (int k = 0;  strArray[i].length>k; k++) {

                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        return sum;
    }
}
