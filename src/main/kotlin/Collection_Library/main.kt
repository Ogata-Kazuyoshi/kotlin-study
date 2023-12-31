package Collection_Library

fun main ()  {
//    println(list.forEach { println(it)})
//    val idList = list.map {elm -> elm *10}
//    println(idList)
//    val list = listOf(User(1,100,"Takehata"),User(2,200,"Kotlin"))
//    val idList2 = list.map {it.teamId}
//    idList2.forEach { println(it) }
//    val filterdList = listUser.filter { it.teamId == 100 }
//    println(filterdList)
//    println(listUser.first {it.teamId == 200})
//    println(listUser.last {it.teamId == 100})
//    val map = listUser.associateBy { it.id }
//    println(map)
//    val listString = listOf("Takehata","Kotlin","Java")
//    val map = listString.associateWith { it.length }
//    println(map)
    val map = listUser.groupBy { it.teamId }
    println(map)
    println(map[100])
}