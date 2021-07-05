class Sword(_name: String){
    var name = _name
    get() = "The Legendary $field"
    set(value){
        field = value.toLowerCase().reversed().capitalize()
    }
}