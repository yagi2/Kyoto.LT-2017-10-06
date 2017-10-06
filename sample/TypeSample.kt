val num  = 0
val dNum = 0.0
val fNum = 0f

when (num) {
	 is Int -> println("num is Int")
	 else -> println("num is not Int")
}

when (dNum) {
	 is Double -> println("dNum is Double")
	 else -> println("dNum is not Double")
}

when (fNum) {
	 is Float -> println("fNum is Float")
	 else -> println("fNum is not Float")
}