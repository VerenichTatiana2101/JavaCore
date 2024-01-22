
public class Seminar {

    /**
     * Метод cesarEncrypt принимает четыре параметра:
     *
     * @param row: Входная строка для шифрования или дешифрования.
     * @param key: Количество позиций, на которое должна быть сдвинута каждая буква текста.
     *             toEncrypt: Булево значение, указывающее, должна ли входная строка быть зашифрована.
     *             toDecipher: Булево значение, указывающее, должна ли входная строка быть расшифрована.
     * @return шифрования или расшифровки
     */
    private String crypt(String row, Integer key) {
        StringBuilder newRow = new StringBuilder();
        for (char letter : row.toCharArray()) {
            newRow.append((char) (letter + key));
        }
        return newRow.toString();
    }

    public String cesarEncrypt(String row, Integer key, Boolean toEncrypt, Boolean toDecipher) {
        if (toEncrypt & toDecipher) {
            return row;
        }
        if (toEncrypt) {
            return crypt(row, key);
        }
        if (toDecipher) {
            return crypt(row, -key);
        }
        return row;
    }

    /**
     * Метод shift принимает два параметра:
     *
     * @param array: Массив, элементы которого нужно сдвинуть.
     * @param step:  Количество позиций, на которое нужно сдвинуть элементы массива.
     *               Метод возвращает новый массив, в котором элементы сдвинуты на заданное количество позиций вправо.
     * @return сдвинутый массив
     */
    public Integer[] shift(Integer[] array, Integer step) {
        Integer[] newArr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            int newPos = (i + step) % array.length;
            newArr[newPos] = array[i];
        }
        return newArr;
    }


    /**
     * Метод нахождения максимального элемента массива
     *
     * @param array входящий массив
     * @return максимальный элемент
     */
    public Integer getMaxValue(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer maxValue = array[0];
        for (Integer value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    /**
     * Метод нахождения минимального элемента массива
     *
     * @param array входящий массив
     * @return минимальный элемент
     */
    public Integer getMinValue(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer minValue = array[0];
        for (Integer value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    /**
     * Задача: Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true если в массиве есть место,
     * в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
     * checkBalance([2, 1, 1, 2, 1]) → false,
     * checkBalance([10, || 1, 2, 3, 4]) → true.
     * Абстрактная граница показана символами ||, эти символы в массив не входят.
     */
    public static boolean checkBalance(int[] array) {
        int leftSum = array[0];
        int rightSum = 0;
        for (int i = 1; i < array.length; i++) {
            rightSum += array[i];
        }
        if (leftSum == rightSum) return true;
        for (int i = 1; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}










