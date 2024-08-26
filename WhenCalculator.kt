

fun main(){


//    var ch='+';
//    var a=2
//    var b=3;
//    var res=when(ch) {
//        '+' -> a + b
//        '-' -> a - b;
//        '*' -> a * b;
//        '/' -> a / b;
//        '%' -> a % b;
//        else -> " Wrong input";
//
//    }
//    println("$a $ch $b is : "+(res))

    var arr=arrayOf(1,2,3,4,5,6,7,8,9,10)


    var sum=0;
    var add=0;
    print("even number is : ")
    for(i in arr.indices){
        if(arr[i]%2==0){
            print("${arr[i]} ")
            sum+=arr[i];
        }


   }
    println( " and sum of even number is : "+sum)


    print("odd number is : ")
    for(i in arr.indices){
        if(arr[i]%2!=0){
            print("${arr[i]} ")
            add+=arr[i];
        }


    }
    println( " and sum of odd number is : "+add)





}