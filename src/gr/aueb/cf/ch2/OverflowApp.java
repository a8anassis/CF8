package gr.aueb.cf.ch2;

/**
 * Προσθέτει δύο ακεραίους αλλά το αποτέλεσμα
 * δημιουργεί υπερχείλιση (overflow)
 */
public class OverflowApp {

    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 100;
        int result;

        result = num1 * num2;

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
