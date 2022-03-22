fun main(){
  var f=productintegers(arrayOf(48,3,59,5,5))
    println(f)
    var d=sumarray(arrayOf(7.1,65,3.3,657,"hyy",5,"virginia"))
    println(d)
    var s=numberofVowels(arrayOf('s','a','g','u','r','o'))
    println(s)



}
fun productintegers(numbers:Array<Int>):Int{
    var  product=1
    numbers.forEach { number->
      product*=number

    }
     return product
}
fun sumarray(mixed:Array<Any>):Double{
    var sum=0.00
    mixed.forEach { t->
      if (t is Double||t is Float){
        sum+=t.toString().toDouble()
        }
        }
   return sum
}
fun numberofVowels(character:Array<Char>):Int{
    var vowel=0
    character.forEach { char->
        if (char=='a'||char=='e'||char=='i'||char=='o'||char=='u'){

        vowel++
        }
    }
     return vowel
}
