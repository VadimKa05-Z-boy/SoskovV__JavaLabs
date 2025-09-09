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

        // Тернарный оператор с математической операцией
        int max = (x > y) ? x : y;
        System.out.println("Максимальное число: " + max);

        System.out.println("\n=== 2.1 Циклы for, while, do...while ===");

        // Цикл for
        System.out.println("Цикл for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Итерация for: " + i);
        }

        // Цикл while
        System.out.println("\nЦикл while:");
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Итерация while: " + counter);
            counter++;
        }

        // Цикл do...while
        System.out.println("\nЦикл do...while:");
        int num = 1;
        do {
            System.out.println("Итерация do-while: " + num);
            num++;
        } while (num <= 5);

        System.out.println("\n=== 2.2 Операторы continue и break ===");

        // Демонстрация break
        System.out.println("Демонстрация break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Достигнуто 6 - выход из цикла");
                break; // Выход из цикла
            }
            System.out.println("i = " + i);
        }

        // Демонстрация continue
        System.out.println("\nДемонстрация continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Пропускаем 3");
                continue; // Переход к следующей итерации
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== 2.3 Многомерный массив ===");

        // Создание и инициализация многомерного массива 3x3
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Многомерный массив:");

        // Перебор всех элементов массива с помощью вложенных циклов for
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }

        // Альтернативный вариант с enhanced for loop
        System.out.println("\nПеребор с помощью enhanced for:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
