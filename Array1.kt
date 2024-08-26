fun main(){


    val arr=arrayOf("bmw","mercedies","roll","suzuki");
    println(arr.size);
    println(arr[0]);
    println(arr.contentToString());
    println(arr.indexOf("bmw"))
    println(arr.first());
    println(arr.last());
    println(arr.lastIndex);
    println(arr.set(2,"sahbaz"));
    println(arr.contentToString())
//    println(arr.reverse(0,arr.size))
//    println(arr.contentToString())
    arr.sortDescending(0,arr.size)
    println(arr.contentToString())

}