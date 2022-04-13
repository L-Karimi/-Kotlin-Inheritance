fun main(){
    var Banker = Banker("Preton",26)
    var Doctor= Doctor("Lucy",24)
    var farmer =farmer("James",23)
    farmer.eat()
    println(farmer is farmer)
    println(Banker is Banker)
    println(farmer is person)
    farmer.cultivateLand()
    Doctor.eat()
    farmer.talk("Hi,welcome to my youtube channel")
    Banker.sleep()
    println( Banker.countMoney(arrayOf(0,4,3,3)))
   // var x= Doctor.treatPatient("Annittah","Chorela")
    farmer.intoduction()
    Banker.intoduction()
    Doctor.intoduction()
}
 open class person(var name:String, var age:Int){
    fun talk(words: String){
        println(words)

    }
    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("ziizizi")
    }
 open fun intoduction(){
    println("Hi my name is $name")
}


 }
class Banker( name:String, age :Int):person(name, age){
    fun countMoney(notes:Array<Int>): Int {
        var sum = 0
        notes.forEach { note->
            sum+=note

        }
        return sum
    }
    }
class Doctor(  name :String, age:Int):person(name, age){
fun treatPatient(name:String, disease:String){

}
    fun  introduction(){
        super.intoduction()
        println("Hi my name is Dr. $name")
    }
}
class farmer( name:String, age:Int):person(name, age){

fun cultivateLand(){
    println("dig dig dig")
}
    override  fun eat(){
        super.eat()
        println("I am eating all the food that i have grown")
    }
}
