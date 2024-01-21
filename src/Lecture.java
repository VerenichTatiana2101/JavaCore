/**
 * Набор методов из лекции JavaCore2
 */
public class Lecture {

    /**
     * Задание:
     * Написать метод «Шифр Цезаря»,
     *
     * @param in      входная строка
     * @param encrypt с булевым параметром зашифрования/расшифрования,
     * @param key     и числовым ключом
     * @return строку из шифра
     */
    public String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty()) return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }

    /**
     * Задание:
     * Написать метод, принимающий на вход массив чисел и параметр n.
     * Метод должен осуществить циклический
     * (последний элемент при сдвиге становится первым) сдвиг всех элементов массива на n позиций;
     *
     * @param a массив чисел
     * @param n позиции
     */
    public void shifter(int[] a, int n) {
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;

        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
    }

    /**
     * Задание:
     * Написать метод, которому можно передать в качестве аргумента массив, состоящий строго из единиц и нулей
     * (целые числа типа int). Метод должен заменить единицы в массиве на нули, а нули на единицы и не содержать
     * ветвлений. Написать как можно больше вариантов метода
     */
    public void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 - a[i];

//            a[i] = (a[i] - 1) + -1;
//            a[i] = (a[i] + 1) % 2;
        }
    }
}
