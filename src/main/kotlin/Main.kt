fun main() {
   val input : CharArray = readln().toCharArray() //Converted the string to array here
   fun rev(s : CharArray){
      var inx = s.size - 1
      while (inx >= 0){
         print(s.elementAt(inx))
         inx--
      }
   }
   rev(input) //Function calling
}