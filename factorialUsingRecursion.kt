class fruits(val a:String,val b:Int) {



fun display(){
    println("${a} and ${b}");
}

}
fun facto(n:Int):Int{
    if(n==0 || n==1)return 1;
    return n*facto(n-1);

}

fun sumOfN(n:Int):Int{
    if(n==1)return 1;

    return n+sumOfN(n-1);
}

fun sumOfEven(n:Int):Int{
  if(n<2)return 0;
    return if(n%2==0){
        n+sumOfEven(n-2);
    }
    else{
sumOfEven(n-1);
    }


}

fun main(){
//println("factorial is : ${facto(5)}")

//    for(i in 1..10){
//        println("factorial is ${i} : ${facto(i)}")
//
//    }



    println(sumOfN(5))
    println(sumOfEven(10))

    val obj=fruits("sahbaz",23);
    val obj2=fruits("apple ",45);

    obj.display()
    obj2.display()


}