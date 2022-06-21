import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */
/**
 *3
11 2 4
4 5 6
10 8 -12
 * output: 15
 *
 * */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var sumMainDiagonal = 0
    var sumSecondaryDiagonal = 0
    var length = arr.size
    for(i in 0..length-1){
        for(j in 0..length -1){
            if(i == j){
                sumMainDiagonal += arr[i][j]
            }
            if(i+j == length -1){
                sumSecondaryDiagonal += arr[i][j]
            }
        }
    }

    return Math.abs(sumSecondaryDiagonal - sumMainDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
