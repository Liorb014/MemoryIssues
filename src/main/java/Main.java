import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        function2();
    }

    public static void function2 () {
        GeneralObject generalObject1 = new GeneralObject(10);
        GeneralObject generalObject2 = new GeneralObject(20);
        CalculationUtil.calculate2(generalObject1, generalObject2);
        System.out.println(generalObject1);
        CalculationUtil.calculate2(generalObject2, generalObject1);
        System.out.println(generalObject1);
    }

    public static void function1 () {
        GeneralObject generalObject1 = new GeneralObject(60);
        CalculationUtil.calculate1(generalObject1);
        System.out.println(getResult(generalObject1));
        GeneralObject generalObject2 = new GeneralObject(40);
        CalculationUtil.calculate1(generalObject2);
        System.out.println(getResult(generalObject2));
    }
    
    public static void function3 () {
        College college = new College(100);
        List<Student> fillThisList = null;
        college.populateWithHigherThanNumber1(fillThisList, 60);
    }

    public static void function4 () {
        College college = new College(100);
        List<Student> fillThisList = null;
        college.populateWithHigherThanNumber2(fillThisList, 60);
    }
    
    public static void function5 () {
        College college = new College(100);
        List<Student> fillThisList = new ArrayList<>();
        college.populateWithHigherThanNumber1(fillThisList, 60);
    }

    public static void function6 () {
        College college = new College(100);
        List<Student> fillThisList = new ArrayList<>();
        college.populateWithHigherThanNumber2(fillThisList, 60);
    }


    public static String getResult (GeneralObject generalObject) {
        return switch (generalObject.getValue()) {
            case 0 -> "A";
            case 1 -> "B";
            case 60 -> "C";
            case 100 ->"D";
            default -> "E";
        };
    }
}
