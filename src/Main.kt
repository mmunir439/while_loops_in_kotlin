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
fun grade(){
    println("enter your name")
    var name=readLine()!!;
    println("enter your obtained marks in mobile application  development")
    var obtained_marks_in_mad=readLine()!!.toInt();
    println("enter your total marks in mobile application  development")
    var total_marks_in_mad=readLine()!!.toInt();
    when(obtained_marks_in_mad){
        in 0..49->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so F Grade")
        in 50..55->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so D Grade")
        in 56..59->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so D+ Grade")
        in 60..64->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so C Grade")
        in 65..69->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so C+ Grade")
        in 70..74->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so B Grade")
        in 75..79->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so B+ Grade")
        in 80..100->println("${name} your obtained_marks_are ${obtained_marks_in_mad} from ${total_marks_in_mad} so A Grade")

    }


}
fun main(){
    var x=1;
    while(x in 1..3) {
        age();
        grade();
        x++;
    }
}