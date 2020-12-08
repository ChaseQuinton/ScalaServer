import java.io.PrintWriter

object Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    def simpleArraySum(ar: Array[Int]): Int = {
        var index = 0
        var sum = 0
        for(i <- 0 to (ar.length-1))
        {
            sum = sum + ar(i)
        }
        return sum
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = simpleArraySum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}