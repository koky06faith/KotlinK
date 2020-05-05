package com.uitprojects.intro


fun main() {
    println(describeString(null))
    println(describeString(""))
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
