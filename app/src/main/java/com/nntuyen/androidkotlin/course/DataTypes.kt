package com.nntuyen.androidkotlin.course

/**
 * Created by Tiki on 9/18/17.
 */

fun main(args: Array<String>) {

}

class Singleton {
  var name:String? = null
  private constructor() {

  }

  companion object {
    val instance:Singleton by lazy { Singleton() }
  }
}
