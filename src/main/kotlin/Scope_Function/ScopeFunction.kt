package Scope_Function

val joinFunc = {
    val list = mutableListOf<Int>()
    for (i in 1..10) {
        if (i % 2 == 1) list.add(i)
    }
    val oddNumbers =list.joinToString(separator = " ")
    println(oddNumbers)
}

val withOddNumber = with(mutableListOf<Int>()) {
    for (i in 1..10){
        if (i % 2 == 1) this.add(i)
    }
    this.joinToString(separator = "//")
}

data class User(var name: String)
fun getUserString(user:User?, newName:String):String? {
    return user?.run {
        name = newName
        this.toString()
    }
}
fun createUser(name:String?):User? {
    return name?.let {User(it)}
}

data class User2(val id:Int, var name:String, var address:String)
fun getUser(id:Int):User2 {
    return User2(id,"Takehata","Tokyo")
}
fun updataUser(id:Int,newName:String,newAddress:String) {
    val user = getUser(id).apply {
        this.name = newName
        this.address = newAddress
    }
    println(user)
}
fun updateUserAlso(id:Int,newName: String,newAddress: String){
    val user = getUser(id).also {
        it.name = newName
        it.address = newAddress
    }
    println(user)
}

