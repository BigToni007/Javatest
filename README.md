Пояснительный файл для тестирования программы AnasJava
Описание программы
Программа предназначена для:

Сравнения двух целых чисел (a и b).
Выполнение арифметических операций: сложение, вычитание, умножение, деление.
Ожидаемый результат:

Программа корректно сравнивает числа и возвращает результаты операций.
При вводе некорректных данных выводится сообщение об ошибке.
Подготовка к тестированию
Убедитесь, что у вас установлен комплект для разработки Java (JDK) последней версии.
Запустите программу через терминал или среду разработки.
Программа должна запросить два числа для сравнения и выполнения операций.
Что тестировать?
1. Сравнение чисел
Позитивные тесты:
Проверить работу программы при следующих условиях:

Входные данные (a, b)	Ожидаемый результат
5, 3	a > b
2, 4	a < b
7, 7	a = b
Негативные тесты:
Проверить поведение программы при вводе некорректных данных:

Входные данные (a, b)	Ожидаемый результат
"азбука", 3	Сообщение: "Ошибка: введено не число."
2, "!"	Сообщение: "Ошибка: введено не число."
2. Арифметические операции
Позитивные тесты:
Убедитесь, что все операции возвращают ожидаемый результат:
Входные данные (a, b)	Операция	Ожидаемый результат
6, 2	Сложение	a + b = 8
6, 2	Вычитание	a - b = 4
6, 2	Умножение	`a * b =
