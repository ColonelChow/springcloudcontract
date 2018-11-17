package com.groovy.example

class Hello {
     static void main(String[] args) {
         def age = 25
         def num = age
         println(num)
         println(5.plus(3))
         println("hello world")



         def str = "hello world"
         println(str[4])
         println(str[1..2])
         println(str[1..<3])
         println(str[4..2])
         println(str[4,1,6])

         println("hello".center(3))
         println("hello".center(11))
         println("hello".center(11,'#'))
         println("hello".leftShift("world"))
         println("hello".padLeft(4))



         println(str.tokenize())
         println(str.tokenize("|"))

         //正则
         def regex = ~'^1[34578]\\d{9}$'
         println("18602559975".matches(regex))


         def nums = [4:[2],6:[3,2],12:[6,4,3,2]]
         println("nums[6]:"+nums[6])

         nums[6]=[6,3,2,1]
         println("nums[6]:"+nums[6])


         //列表
         def list = [['zhangsan','java'],['lisi','c']]
         println "${list})"
         println list.size()

         list.add(['zhaoliu','c#'])
         list<<['zhaoliu','c++']

         println "${list})"
         println list.size()


    }



    void sayHello(String str){
       printf("hello,%s%n",str)
    }
    def sayHello2(String str){
        return str
    }
}
