// Напишите программу которая считает сумму чисел от 1
// до числа X (где значение X равняется произведению дня вашего рождения на год)

//1. Создайте проект
//2. Напишите программу которая считает сумму чисел от 1 до числа X (где значение X равняется произведению дня вашего рождения на год)
//3. Инициализируйте локальный репозиторий
//4. Сделайте первый коммит содержащий папку src, файл .gitignore, папку .idea и файл с расширением .iml
//5. Поменяйте число X на число Y (где значение Y равняется произведению месяца вашего рождения на год)
//6. Сделайте второй коммит с этим изменением

public class Calculation {
    public static void main(String[] args) {
        int targetNumber = 9 * 1915;
        int result = sumUpTo(targetNumber);
        System.out.println("sumUpTo(" + targetNumber + ") = " + result);
    }

    public static int sumUpTo(int targetNumber) {
        int result = 0;

        for (int i = 1; i <= targetNumber; i++) {
            result += i;
        }

        return result;
    }
}
