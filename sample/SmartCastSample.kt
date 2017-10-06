val message: String? = "Hello"

// println(message.toUpperCase()

message?.let {
    println(it.toUpperCase())
}

val list: List<Any> = listOf(1, 'a', false)
for (item in list) {
	val result: Any? = when(item) {
		is Int -> item + item
		is Char -> item.toUpperCase()
		is Boolean -> item.not()
	}
	println(result)
}