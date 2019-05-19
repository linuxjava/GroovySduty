package base
/**
 * groovy数据结构学习
 */

//groovy中定义list
def list = [1, 2, 3, '122']
println list.class

for (item in list) {
    switch (item) {
        case Integer:
            println "int ${item}"
            break
        case String:
            println "String ${item}"
            break
        default:
            println "unkown ${item}"
    }
}

//定义数组
int[] list1 = [1, 2, 3]
println list1.class

/**
 * list添加元素
 */
def sortList = [6, -3, 9, 2, -7, 1, 5]
//println sortList.add(20)
//println sortList.leftShift(20)
//println sortList << 20

/**
 * list删除元素
 */
//sortList.removeAll {return it % 2 == 0}
//println sortList
//println sortList - [6, 7]

/**
 * list排序
 */
//sortList.sort()
//println sortList
//sortList.sort {a, b ->
//    return a == b ? 0 : (Math.abs(a) > Math.abs(b) ? 1 : -1)
//}
//println sortList

//对字符串list排序
//def sortStringList = ['z', 'abc', 'hello', 'groovy', 'java']
////按照字符串长度倒序排列
//sortStringList.sort{
//    return -it.size()
//}
//println sortStringList

/**
 * list查找
 */
def sortList1 = [19, -3, 9, 13, -7, 1, 5]
//println sortList.find { return it % 2 == 0 }
//println sortList.findAll { return it % 2 == 0 }
//判断list中是否有偶数元素
println sortList1.any {return it % 2 == 0}
//判断list中是否都是奇数元素
println sortList1.every {return it % 2 != 0}
println sortList.min()
println sortList.max()