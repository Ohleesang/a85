/**
 *  3~1000 elements 의 길이
 *  1~1000 elements 의 원소
 *  elements가 순서대로 주어질 때,
 *  원형 수열의 연속 부분 수열 합으로 만들 수 있는 개수를 Return
 *
 *  연속 하는 부분 수열?(먼 개소리여)
 *  [7,9,1,1,4]
 *  길이가 1 -->[1,1,4,7,9]
 *  > 1,4,7,9 네 가지합
 *  길이가 2 --> [[1,1],[1,4],[4,7],[7,9],[9,1]]
 *  > 2,5,10,11,16 다섯 가지 합
 *  길이가 3 --> [1,1,4],[1,4,7],[4,7,9],[7,9,1],[9,1,1]
 *  ...
 *
 *  주어진 배열으로 길이가 1~elements.size 까지의 수열을 구할 수 있다.
 *  이때 구한 수열들의 인자값들의 합이 중복되지 않아야 하며,
 *  그러한 모두의 경우의 수를 return!
 *
 *  1~elements.size-1 : k
 *  1. 길이 k 인 배열을 만든다
 *  2. 만든 배열의 합을 data 에 저장 한다
 *  3. 만들어진 배열의 사이즈를 return 한다
 *
 */




class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution(intArrayOf(7,9,1,1,4))//18
}