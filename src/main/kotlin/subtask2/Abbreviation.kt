package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        a.toUpperCase()
        var aA = a.toUpperCase().toCharArray()
        var bB = b.toCharArray()
        var stringBuilder: StringBuilder = StringBuilder("")
        aA.forEach {
            if (bB.contains(it)) {
                stringBuilder.append(it)
            }
        }
        return if (stringBuilder.toString().contains(b)) {
            "YES"
        } else {
            "NO"
        }
    }
}
