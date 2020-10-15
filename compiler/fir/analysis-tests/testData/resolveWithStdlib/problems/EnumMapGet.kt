// FULL_JDK

import java.util.EnumMap

typealias SomeEnumMap = EnumMap<String, String?>

fun test(map: SomeEnumMap, qualifier: String?) {
    val result = <!AMBIGUITY!>map[qualifier]<!>
}