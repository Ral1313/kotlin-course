// Задание 1: "Определение Сезона"  Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
fun whatseason(month: Int):String {
    return when (month) {
        in 1..2 , 12 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Error"
    }
}
//Задание 2: "Расчет Возраста Питомца"  Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
fun whatpetAge(age: Int): Double {
    return if (age in 0 .. 2 ){
        age * 10.5
    } else
        (2 * 10.5) + ((age - 2) * 4)
}
//Задание 3: "Определение Вида Транспорта" Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun whattransport (distance: Double): String {
    return if (distance < 1) { "пешком"
    } else if (distance in 1.0..5.0){ "велосипед"
    }else "автомобил"
}
//Задание 4: "Расчет Бонусных Баллов"Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
fun bonusProgramm (buy: Double): Double {
    return if (buy <= 1000.0) {
        (buy / 100) * 2
    } else 10 + ((buy - 1000.0) / 100) * 5
 }
//Задание 5: "Определение Типа Документа" Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
fun docType(type: String): String {
    return when(type) {
        in "doc" -> "Текстовый Документ"
        in "png" -> "Изображение"
        in "xls" -> "Таблица"
        else -> "Неизвестный формат"
    }
}
//Задание 6: "Конвертация Температуры" Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку. Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия
fun tempConv(value: Int, unit: String): String {
    return if
    }
//Задание 7: "Подбор Одежды по Погоде" Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
fun whattowear (tempurature : Int): String{
    return  when {        tempurature <= -30 -> "рекомендуйте не выходить из дома"
        tempurature  in -19..0 -> "куртка и шапка"
        tempurature  in 1..15 -> "ветровка"
        tempurature  in 16..35 -> "футболка и шорты"
        tempurature  > 35 -> "рекомендуйте не выходить из дома"
        else -> {"нет данных"}
    }
}
//Задание 8: "Выбор Фильма по Возрасту" Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".
fun whatrate(age : Int): String {
    return when(type) {
        in <0..12 -> "детские"
        in 13..17 -> "подростковые"
        in 18 <= -> "взрослые"
        else -> "Error"
    }

}