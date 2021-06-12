package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            String::class -> {
                blockA.filterIsInstance(String::class.java).reduce { str1, str2 -> str1 + str2 }
            }
            Int::class -> {
                blockA.sumBy { any ->
                    if (any is Int) {
                        any
                    } else
                        0
                }
            }
            LocalDate::class -> {
                var localDate: LocalDate = LocalDate.MIN
                blockA.forEach { curr ->
                    if (curr is LocalDate) {
                        if (localDate.isBefore(curr))
                            localDate = curr
                    }
                }
                return localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> {
                "class type not supported"
            }
        }
    }
}
