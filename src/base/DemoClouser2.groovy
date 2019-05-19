package base

/**
 * 闭包使用
 */

int fab(int number) {
    def reslut = 1
    1.upto(number, {
        println it
        reslut *= it
    })

    return reslut
}

//println fab(5)

/**
 * 注意：闭包放在括号内和括号外效果是一样的
 * @param number
 * @return
 */
int fab1(int number) {
    def reslut = 1
    number.downto(1) {
        println it
        reslut *= it
    }

    return reslut
}

println fab1(5)

/**
 * 如果方法没有参数(闭包除外)，那么()可以省略
 * @param number
 * @return
 */
int fab2(int number) {
    def reslut = 0
    number.times {
        reslut += it
    }

    return reslut
}
//完成从0到100累加，因为times里的实现是<号，所以参数是101
println fab2(101)


