import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //-----------------------Лекция 2-------------------//
        Lecture lecture = new Lecture();
        System.out.println(lecture.caesar("Привет, мир", 5, true));
        System.out.println(lecture.caesar("Фхнзкч1%снх", 5, false));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        lecture.shifter(arr, 2);
        System.out.println(Arrays.toString(arr));
        lecture.shifter(arr, -2);
        System.out.println(Arrays.toString(arr));

        int[] array = {1, 1, 1, 0, 0, 0};
        lecture.change(array);
        System.out.println(Arrays.toString(array));

        //----------------------Семинар 2-------------------//



    }
}
