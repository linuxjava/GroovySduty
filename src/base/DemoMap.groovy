package base
/**
 * groovy map学习
 */

def colors = [
        red  : 'ff0000',
        green: '00ff00',
        blue : '0000ff'
]

//索引
//println colors.red
//println colors['green']
//添加元素
//colors.complex = [a: 1, b: 2]
//println colors

/**
 * 注意map获取类型是不能使用.class，因为这种方式与添加元素的方式冲突，且map中是没有.class的
 * map提供了getClass方法
 */
//println colors.class
//println colors.getClass()

/**
 * map遍历
 */
def students = [
        4: [number: '0001', name: 'Bob', score: 55, sex: 'male'],
        5: [number: '0002', name: 'Johnny', score: 62, sex: 'female'],
        6: [number: '0003', name: 'Claire', score: 73, sex: 'female'],
        7: [number: '0004', name: 'Amy', score: 66, sex: 'male']
]

//students.each { student ->
//    println student.key + ' : ' + student.value
//}

//students.eachWithIndex{ student, index ->
//    println "[${index}] "+ student.key + ' : ' + student.value
//}

//students.eachWithIndex{ key, value, index ->
//    println "[${index}] "+ key + ' - ' + value
//}