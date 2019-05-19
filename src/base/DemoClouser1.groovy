package base
/**
 * 闭包基础
 */

/**
 * 闭包隐式参数:调用时只允许有一个参数
 */
def clouser = {
    println "params : ${it}"
}
clouser('name')//闭包调用方式1
//clouser.call()//闭包调用方式2

/**
 * 闭包显示参数使用
 */
def clouser1 = {String name, int age ->
    age++
    println "name: ${name}, age: ${age}"
}
clouser1('xiaoguochang', 29)

/**
 * 闭包返回值
 */
def clouser2 = {String name, int age ->
    age++
    return  "name: ${name}, age: ${age}"
}
println clouser2('xiao', 29)