package base
/**
 * groovy string学习
 */

/////////////////////////字符串的基本使用/////////////////////////////////////

def name = 'this is name'
println name.class

/**
 * 三引号的优点是，输出是按照字符串的编辑格式进行输出
 * 下面\的意思是连接符，否则输出的trupleName第一行会换行
 */
def trupleName = '''\
this is trupleName
 one
  two
   three
'''
println trupleName.class
println trupleName

/**
 * 双引号中如果包含扩展表达式，那么其类型是GString而不是java中的String
 */
def test = 'hello';
def doubleName = "this is doubleName : ${test}"
println doubleName.class
println doubleName

doubleName = "2 + 3 = : ${2 + 3}"
println doubleName

/////////////////////////字符串常用方法/////////////////////////////////////
def str = 'groovy'
println str.center(8, 'a')
println str.padLeft(8, 'a')
println str.padRight(8, 'a')

//从字符串str1中去掉str2字符串
def str1 = 'groovyHello'
def str2 = 'Hello'
println str1.minus(str2)
println str1 - str2//groovy提供侧特殊方法

//比较str1和str2的大小
println str1.compareTo(str2)
println str1 > str2//groovy提供侧特殊方法

//索引字符串中某个字符
println str1[1]
println str1[2..5]


