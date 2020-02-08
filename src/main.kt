class cars(){

    var Country:String?=null
    var Model:String?=null
    var Year:kotlin.Int?=null

    constructor(Country:String, Model:String, Year: Int): this(){
        println("Name: $Country")
        println("Continent: $Model")
        println("Year of manufacture: $Year")

        this.Country=Country
        this.Model=Model
        this.Year=Year
    }
    constructor(Contacts: String) :this(){
        var Email:String?=null
        Email="p.ndungu.kara@gmail.com"
        println("Feel free to communicate with us for additional information.")
        println("Email: $Email")
    }
}
fun getEmail(){
    return getEmail()
}
fun getCountry(){
    return getCountry()
}
fun getModel(Model: String): String? {
    return Model
}
fun getYear(Year: Int): kotlin.Int? {
    return Year
}
//below is the beginning of the main function

fun main(){

    println("MERCEDES")
    var merc= cars("Germany", "Gt amg", 2018)
    println("---------------------------")

    println("Nissan")
    var niss= cars("Japan", "Gtr nismo", 2018)
    println("---------------------------")

    println("Pagani")
    var pag= cars("Italy", "huayra", 2012)
    println("---------------------------")
//    -------------------------------------------------------------
    println("Contact")
    var Email= cars("p.ndungu.kara@gmail.com")

}