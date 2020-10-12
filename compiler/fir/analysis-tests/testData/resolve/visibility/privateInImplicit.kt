interface I {
    val a = 2
}
open class B {
    private val a = 3
}
class D : B(), I {
    val x = a // should refer to I.a
}
class E : B() {
    val x = <!HIDDEN!>a<!>
}