fun main() {
    var Zap = ""
    var con = false
    var i = 0
    println(" Введите Запрос")
    Zap =readln()
    if (Zap == "time")
    {
        var sec = 0
        while (!con)
        {
            println(" Введите Количество Секунд!")
            sec =readln().toInt()
            println(agoToText(sec)+"\uD83D\uDD53")
            println()
            i++
            if(i==4){
            println("Хотите Выйти")
            con = readln().toBoolean()
            i=0
            }
        }
    }
}

fun agoToText(seconds: Int): String {
    return when {
        seconds < 0 -> "некорректное время"
        seconds < 60 -> "был(а) только что"
        seconds < 3600 -> "Был(а) ${Minuts(seconds / 60)} назад"
        seconds < 86400 -> "Был(а) ${FHours(seconds / 3600)} назад"
        seconds < 172800 -> "был(а) вчера"
        seconds < 259200 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
}

 fun Minuts(min: Int): String {
        val last1D = (min % 10).toInt()
        val last2D = (min % 100).toInt()

        return if (last1D in 11..14) {
            "$min минут"
        } else when (last2D) {
            1 -> "$min минуту"
            2, 3, 4 -> "$min минуты"
            else -> "$min минут"
        }
    }

 fun FHours(hours: Int): String 
 {
        val last1D = (hours % 10).toInt()
        val last2D = (hours % 100).toInt()

        return if (last1D in 11..14) {
            "$hours часов"
        } else when (last2D) {
            1 -> "$hours час"
            2, 3, 4 -> "$hours часа"
            else -> "$hours часов"
    }
}

