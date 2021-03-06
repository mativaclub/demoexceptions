package com.example.exceptions.demoexceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoexceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoexceptionsApplication.class, args);
	}


}

//Написать непроверяемое исключение, которое выбрасывается, если сотрудник не найден.
//Возвращает статус 404 Not Found.

//Написать непроверяемое исключение, которое выбрасывается, если массив сотрудников переполнен.
//Возвращает статус 500 Internal Server Error.

//Написать непроверяемое исключение, которое выбрасывается,
// если в массиве есть сотрудник, когда сотрудника пытаются добавить в массив.
//Возвращает статус 400 Bad Request.

//Добавить в методы из шага 5 новые исключения.

//1. В метод с добавлением сотрудника нужно добавить выброс
// исключения из шага 7 в ситуации, когда массив переполнен.
//2. В метод с добавлением сотрудника нужно добавить выброс
// исключения из шага 8 в ситуации, когда добавляемый сотрудник уже имеется в массиве.
//3. В метод с удалением сотрудника нужно добавить выброс
// исключения из шага 6 в ситуации, когда удаляемый сотрудник не найден.
//4. В метод с поиском сотрудника нужно добавить выброс
// исключения из шага 8 в ситуации, когда сотрудник не найден.
//

//### Шаг 11
//
//Объявить в контроллере 3 метода:
//
//1. По адресу /employee/add?firstName=Ivan&lastName=Ivanov должен
// вернуться объект Employee в формате JSON, т. е.
// { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение
// со статусом 500 Internal Server Error в случае переполнения
// массива или 400 Bad Request в случае, когда сотрудник уже существует.
//2. По адресу /employee/remove?firstName=Ivan&lastName=Ivanov
// должен вернуться объект Employee в формате JSON, т. е.
// { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение
// со статусом 404 Not Found, если сотрудник отсутствует.
//3. По адресу /employee/find?firstName=Ivan&lastName=Ivanov должен
// вернуться объект Employee в формате JSON, т. е.
// { "firstName": "Ivan", "lastName": "Ivanov" },
// или исключение со статусом 404 Not Found, если такой сотрудник отсутствует.
//
//### Подсказки


//3. Возврат статуса осуществляется с помощью аннотации @ResponseStatus.

//5. В случае отсутствия одного из параметров Spring должен самостоятельно
// выводить страницу с ошибкой (аннотация @RequestParam).

//7. Spring сам конвертирует ваш объект Employee в JSON. Достаточно просто
// вернуть его через return в методе контроллера.