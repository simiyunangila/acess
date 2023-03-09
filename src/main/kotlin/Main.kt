import kotlin.math.max

fun main() {
    println()
}
//1. Write and invoke a function that takes in any 2 strings and returns the first character of the
// longer string or the first character of the first string if they are equal in length. (4 pts)

//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements (7 pts)
fun numArray(r:Array<Int>):Int{
    var r= arrayOf(12,45,56,67)
   var min= r.min()
    var max=r.max()
   var average=r.average()
    var total= arrayOf(min, average, max)
    return numArray()
}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3 pts)
fun split(){
    var x= "school"
    println("${x[0]} ${x[1]}${x[2]}${x[3]}${x[4]}${x[5]}")
}
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it. (4 pts)
fun two(){
    var a="day"
    var b="two"
    var c=a.plus(b)
    return two()
}
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class calculator(var Addition:Int, var subtraction:Int,var division:Int, var multiplication:Int){
    fun sum(){
        var x= 12+12
        println(x)
    }
    fun division(){
        var y=12/2
        println(y)

    }
}
