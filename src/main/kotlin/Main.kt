import com.sun.org.apache.xml.internal.utils.res.StringArrayWrapper
import com.sun.org.apache.xpath.internal.functions.FuncFalse
import java.util.*

fun main(args: Array<String>) {
    sumAverageDoubleArray()
    stringArrayFunctions()
    isFoundInIntArray()
}

fun sumAverageDoubleArray() {
    val s = Scanner(System.`in`)
    println("Enter number of elements in the double array")
    val size = s.nextInt()
    val doubleArray = DoubleArray(size)

    println("Enter array elements: ")
    for (i in doubleArray.indices) {
        print ("doubleArray[$i]: ")
        doubleArray[i] = s.nextDouble()
    }

    var sum: Double = 0.toDouble()
    for (i in doubleArray.indices) {
        sum += doubleArray[i]
    }

    val average = sum / doubleArray.size

    println("Array: ${doubleArray.contentToString()}")
    println("Sum of Elements: $sum")
    println("Average of elements: $average")

    println("Using builtin functions:")
    println("Sum of Elements: ${doubleArray.sum()}")
    println("Average of elements: ${doubleArray.average()}")
}

fun stringArrayFunctions() {
    val s = Scanner(System.`in`)

    println("Enter the number of elements in the String array: ")
    val size = s.nextInt()
    val stringArray = Array<String>(size){""}

    println("Enter string array elements: ")
    for(i in stringArray.indices){
        print("stringArray[$i]: ")
        stringArray[i] = readlnOrNull().toString()
    }
    println("String array elements: ${stringArray.contentToString()}")

    val reversedArray = stringArray.reversedArray()
    println(reversedArray.contentToString())

    val ascSortedArray = stringArray.sortedArray()
    println("Sorted asc string array elements: ${ascSortedArray.contentToString()}")

    val desSortedArray = stringArray.sortedArrayDescending()
    println("Sorted des string array elements: ${desSortedArray.contentToString()}")
}

fun isFoundInIntArray() {
    val s = Scanner(System.`in`)

    print("Enter number of elements in array:")
    val size = s.nextInt()
    val intArray = IntArray(size)

    print("Enter int array elements: ")
    for (i in intArray.indices) {
        print("intArray[i]:")
        intArray[i] = s.nextInt()
    }
    println(intArray.contentToString())

    print("Enter int to be found: ")
    val num = s.nextInt()

    var isFound = false
    var itemAt = 0

    for (item in intArray) {
        if (item == num) {
            isFound = true
            itemAt = intArray.indexOf(item)
        }
    }

    if (isFound) {
        print("$num found at $itemAt")
    } else {
        System.err.println("Not found")
    }
}