package subtask1

import java.time.DateTimeException
import java.time.DayOfWeek
import java.time.LocalDate


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val dayNames = mapOf(
            1 to "понедельник",
            2 to "вторник",
            3 to "среда",
            4 to "четверг",
            5 to "пятница",
            6 to "суббота",
            7 to "воскресенье")

        val monthNames = mapOf(
            1 to "января",
            2 to "февраля",
            3 to "марта",
            4 to "апреля",
            5 to "мая",
            6 to "июня",
            7 to "июля",
            8 to "августа",
            9 to "сентября",
            10 to "октября",
            11 to "ноября",
            12 to "декабря")

        var date: LocalDate
        try {
            date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        } catch (e: DateTimeException) {
            return "Такого дня не существует"
        }
        val dayOfWeek: DayOfWeek = date.getDayOfWeek()
        return "$day ${monthNames[month.toInt()]}, ${dayNames[dayOfWeek.value]}"
    }
}
