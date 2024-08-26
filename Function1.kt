class Function1 {
}
fun add(){
    var a=3
    var b=4
    println("addition is : "+(a+b))
}

fun data(name:String,id:Int){
    println("name and id is : "+(name +" "+id))
}

//fun getdata(a:Int,b:Int ):Int{
//    return a*b;
//}

fun getdata(a:Int,b:Int)=a+b
fun putdata():Int{
    return 2*5;
}
fun main(){

add()
    data("sahbaz",100)
    println(getdata(2,3))
    println(putdata())


}