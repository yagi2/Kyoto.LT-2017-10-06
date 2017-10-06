val num:Int = 3
println(num * num)

fun Int.square(): Int = this * this
println(num.square())

fun <T> List<T>.filterEvenIndex(): List<T> {
	return withIndex()
				.filter { it.index % 2 == 0 }
				.map { it.value }
}

val nums = listOf(1, 2, 3, 4, 5)
println(nums.filterEvenIndex())

val chars = listOf('a', 'b', 'c', 'd', 'e')
println(chars.filterEvenIndex())