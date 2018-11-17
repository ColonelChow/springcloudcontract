package com.groovy.example

class HelloTest extends GroovyTestCase{
    def void testSayhello(){
        Hello hello = new Hello()
        hello.sayHello("zhangsan")
    }
}
