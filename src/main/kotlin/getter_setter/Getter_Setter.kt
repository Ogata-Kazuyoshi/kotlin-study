package getter_setter

class Getter_Setter {
    var name: String = ""
        get(){
            println("getter関数を通ってます")
            return field
        }
        set(value) {
            println("setter関数にて関数を設定")
            field = value
        }
}