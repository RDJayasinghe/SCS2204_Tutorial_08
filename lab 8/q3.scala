object q3 extends App{

    def formatNames(name:String)(index:Int)(Func: String=>String):String={

        if(index>0 && index<name.length()){
        var str=""
        str=name.substring(0,index)
        str=str+Func(name.charAt(index).toString())
        str=str+name.substring(index+1,name.length())
        
        str
        }else{
        Func(name)
        }

    }

    println(formatNames("Benny")(-1)(name => name.toUpperCase));
    println(formatNames("Niroshan")(1)(name => name.toUpperCase));
    println(formatNames("Saman")(-1)(name => name.toLowerCase));
    println(formatNames("Kumara")(5)(name => name.toUpperCase));
}

