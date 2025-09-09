public class FirstLab {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 3;
        int d = 7;

        System.out.println("\n3. Четыре операнда (И/ИЛИ):");
        if ((a > b && c < d) || (a == 10 && b != 5)) {
            System.out.println("(a > b И c < d) ИЛИ (a = 10 И b ≠ 5)");
        } else if (a < b || c > d) {
            System.out.println("a < b ИЛИ c > d");
        } else {
            System.out.println("Все условия false");
        }

        System.out.println("\n=== 1.2 Конструкция switch/case ===");
        int dayOfWeek = 3;
        System.out.println("День недели: " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной день");
        }

        System.out.println("\n=== 1.3 Тернарный оператор ===");

        int x = 8;
        int y = 12;

        // Простой тернарный оператор
        String result = (x > y) ? "x больше y" : "x не больше y";
        System.out.println("Результат: " + result);

        // Вложенный тернарный оператор
        String comparison = (x > y) ? "x больше y" :
                (x < y) ? "x меньше y" : "x равно y";
        System.out.println("Сравнение: " + comparison);

        // Тернарный оператор с математической операцией
        int max = (x > y) ? x : y;
        System.out.println("Максимальное число: " + max);
    }
}
