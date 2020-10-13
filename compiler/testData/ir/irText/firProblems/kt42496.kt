// FILE: JavaClass1.java
public class JavaClass1 {
    protected Object value = null;

    public Object getSomething() { return null; }
    public void setSomething(Object value) {  this.value = value; }
}

// FILE: JavaClass2.java
public class JavaClass2 extends JavaClass1 {
    public String getSomething() { return (String)value; }
}

// FILE: kt42496.kt

fun box(): String {
    val javaClass = JavaClass2()
    javaClass.something = "OK"
    return javaClass.something
}
