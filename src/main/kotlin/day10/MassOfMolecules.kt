package day10

import java.util.*


fun main() {
    val read  = Scanner(System.`in`)
    val input = read.nextLine().toString()
    val stack = Stack<Int>()
    var v  = 0
    for (i in input.indices) {
        if (isNumber(input[i])){
            v = stack.peek()
            stack.pop();
            stack.push(v * (input[i]-'0'));
        }else if(input[i]=='(') stack.push(-1);
        else if(input[i]==')')
        {
            v = 0;
            while(!input.isEmpty() && stack.peek()!=-1)
            {
                v += stack.peek();
                stack.pop();
            }
            stack.pop();
            stack.push(v);
        }
        else if(isLetter(input[i])) stack.push(getValue(input[i]));
    }
    var result = 0
    while (!stack.isEmpty()) {
        val top = stack.peek()
        result += top
        stack.pop()
    }
    println(result)
}
private fun isNumber(s: Char): Boolean {
    return s == '2' || s == '3' || s == '4' || s == '5' || s == '6' || s == '7' || s == '8' || s == '9'
}
private fun isLetter(s: Char): Boolean {
    return s == 'C' || s == 'H' || s == 'O'
}

private fun getValue(s: Char): Int {
    when (s) {
        'H' -> return 1
        'C' -> return 12
        'O' -> return 16
    }
    return 0
}