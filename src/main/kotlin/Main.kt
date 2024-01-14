fun main() {
    val user1 = User("Name 1")
    val user2 = User("Name 2")

    val names = mutableSetOf<User>(user1,user2)
    names.forEach { println(it) }
}

class User(val name:String)