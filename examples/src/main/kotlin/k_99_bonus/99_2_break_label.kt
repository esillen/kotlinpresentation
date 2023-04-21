package k_99_bonus


// range of elements
val oneToTen : IntRange = 1..10 // <-- represents [1,2,3,4,5,6,7,8,9,10].
val theSum = oneToTen.map {
    it + 3
}.sum()



fun breakAndSideEffect() {
    // labeled expressions
    myLoopLabel@ for (i in 1..100) {
        for (j in 1..100) {
            if (i == j * 50) break@myLoopLabel // Break back to label! Kind of like GOTO (!)
        }
    }
    print("some important logging or something")
}
// Same behaviour in java would look something like:
//public void() {
//  found = false;
//  for (int i = 1; i < 101; i++) {
//    for (int j = 1; j < 101) {
//      if (i == j * 50) {
//        found = true;
//        break;
//      }
//    }
//    if (found) {
//      break;
//    }
//  }
//  System.out.println("some important logging or something);
//}































val theTruth = "KOTLIN IS AWESOME"

val is_equal : Boolean = theTruth == "KOTLIN IS AWESOME"        // <-- same as java's .equals(), is actually syntactic sugar.
val points_to_same : Boolean = theTruth === "KOTLIN IS AWESOME" // <-- same as java's ==  (probably true here due to JVM's string pool)


