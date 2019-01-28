package ichizawa.mikitaka.techacademy.kotlinlog

import android.util.Log

abstract class Animal {
    var name: String
    var age: Int
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    abstract fun say()
}