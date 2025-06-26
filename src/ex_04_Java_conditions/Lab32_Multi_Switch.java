package ex_04_Java_conditions;

public class Lab32_Multi_Switch {
    public static void main(String[] args) {
        int age=1000;
        switch (age)
        {
            case 10, 20, 30, 40, 50:
                System.out.println("upcoming Inda");
                break;
            case 60, 70, 80, 90, 100:
                System.out.println("Current india");
                break;
            default:
                System.out.println("No india ");

        }

    }
}
