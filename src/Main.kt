//Q1) find the age of the student for vote checking
//Q2) find the grades of the student
//Q3) find the semester of the student
fun age(){
    println("kindly enter your name");
    val name = readLine()!!   // <-- input as string
    println("kindly enter your age");
    var yourage=readLine()!!.toInt();
    when(yourage){
        in 1..17->println("${name} your age  ${yourage}<18 so you  can not give vote")
        in 18..200->println("${name} your age ${yourage}>=18 so you  can give vote")
        else->println("${name} kindly wait for the election to starts")
    }
}
fun main(){
    var x=1;
    while(x in 1..3) {
        age();
        x++;
    }
}