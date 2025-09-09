public class FirstLabFixed {
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

            System.out.println("\n=== 3. Boxing и NullPointerException ===");

            // 3.1 Автоупаковка и распаковка (Autoboxing/Unboxing)
            System.out.println("--- Autoboxing/Unboxing ---");

            int primitiveInt = 42;
            Integer wrapperInt = primitiveInt; // Autoboxing: int -> Integer
            int unboxedInt = wrapperInt;       // Unboxing: Integer -> int
            System.out.println("int/Integer: " + primitiveInt + " -> " + wrapperInt + " -> " + unboxedInt);

            // boolean / Boolean
            boolean primitiveBool = true;
            Boolean wrapperBool = primitiveBool; // Autoboxing: boolean -> Boolean
            boolean unboxedBool = wrapperBool;   // Unboxing: Boolean -> boolean
            System.out.println("boolean/Boolean: " + primitiveBool + " -> " + wrapperBool + " -> " + unboxedBool);

            // long / Long
            long primitiveLong = 123456789L;
            Long wrapperLong = primitiveLong;   // Autoboxing: long -> Long
            long unboxedLong = wrapperLong;     // Unboxing: Long -> long
            System.out.println("long/Long: " + primitiveLong + " -> " + wrapperLong + " -> " + unboxedLong);

            // 3.2 Имитация NullPointerException
            System.out.println("\n--- NullPointerException ---");
            try {
                Integer nullInteger = null;
                System.out.println("Создали Integer со значением null: " + nullInteger);

                // Попытка распаковать null - вызовет NullPointerException
                int result = nullInteger; // Эта строка вызовет исключение
                System.out.println("Это сообщение не будет выведено");
            } catch (NullPointerException e) {
                System.out.println("Поймали NullPointerException: " + e.getMessage());
                System.out.println("Нельзя распаковать null значение в примитивный тип!");
            }

            System.out.println("\n=== 4. Работа со строками ===");

            // 4.1 Базовые операции со строками
            System.out.println("--- 4.1 Базовые операции ---");
            String originalString = "   Hello World, Java Programming!   ";
            System.out.println("Исходная строка: '" + originalString + "'");

            // Замена в строке
            String replacedString = originalString.replace("Java", "Python");
            System.out.println("После замены: '" + replacedString + "'");

            // Обрезка строки (trim)
            String trimmedString = originalString.trim();
            System.out.println("После обрезки пробелов: '" + trimmedString + "'");

            // Разбиение строки по разделителю
            String csvString = "apple,orange,banana,grape";
            String[] fruits = csvString.split(",");
            System.out.println("Разбиение строки по запятым:");
            for (String fruit : fruits) {
                System.out.println("  - " + fruit);
            }

            // 4.2 Сравнение строк
            System.out.println("\n--- 4.2 Сравнение строк ---");
            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = new String("Hello");
            String str4 = "HELLO";

            System.out.println("str1 = \"Hello\", str2 = \"Hello\", str3 = new String(\"Hello\"), str4 = \"HELLO\"");

            // Сравнение через == (сравнивает ссылки)
            System.out.println("str1 == str2: " + (str1 == str2));       // true - один литерал в пуле строк
            System.out.println("str1 == str3: " + (str1 == str3));       // false - разные объекты
            System.out.println("str1 == str4: " + (str1 == str4));       // false - разные строки

            // Сравнение через equals (сравнивает содержимое)
            System.out.println("str1.equals(str2): " + str1.equals(str2));       // true
            System.out.println("str1.equals(str3): " + str1.equals(str3));       // true
            System.out.println("str1.equals(str4): " + str1.equals(str4));       // false

            // Сравнение через equalsIgnoreCase (без учета регистра)
            System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

            // 4.3 StringBuilder
            System.out.println("\n--- 4.3 StringBuilder ---");

            // Конкатенация строк
            StringBuilder sb = new StringBuilder();
            sb.append("Hello").append(" ").append("World").append("!");
            System.out.println("После конкатенации: " + sb.toString());

            // Обрезка строки (удаление части)
            sb.delete(5, 11); // Удаляем с 5 по 10 индекс (" World")
            System.out.println("После удаления: " + sb.toString());

            // Вставка и модификация
            sb.insert(5, " Java");
            System.out.println("После вставки: " + sb.toString());

            // Замена части строки
            sb.replace(6, 10, "Programming");
            System.out.println("После замены: " + sb.toString());
        }
}
