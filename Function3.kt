
fun Sum(){
    val a:Int=32;
    val b:Int=45;
    println("sum is ${a+b}");
}

fun Sum1(a:Int,b:Int){
    println("sum is : ${a+b}");
}

fun Sum2():Int{
    var a=22;
    var b=32;
    val c=a+b;
    return c;
}

fun Sum3(a:Int,b:Int):Int{
    return a+b;
}


fun main(){
    Sum();
    Sum1(2,5);
    println("sum is ${Sum2()}");
    println("sum is : ${Sum3(3,3)}");

}

