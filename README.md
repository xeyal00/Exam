# Exam
3)Primary constructors are part of the class header, and their purpose is to initialize the class properties. They can have optional parameters with default values, making them more concise and expressive.
class Person(val firstName: String, val lastName: String, var age: Int) {
    // Class body
}
Primary Constructor with default parametrs:
class Rectangle(val width: Int = 1, val height: Int = 1) {
    // Class body
}

val square = Rectangle()
val customRectangle = Rectangle(4, 6)
Initilization blocks:
class Employee(firstName: String, lastName: String, age: Int) {
    val fullName: String

    init {
        fullName = "$firstName $lastName"
    }

    init {
        println("Employee created: $fullName, age $age")
    }
}

4)The data class in Kotlin is just a simpler syntax for a class that has no (or minimal) logic, and contains certain values. Kotlin generates the equals(), hashCode() and toString() functions for you in a data class, along with some other helper functions.
data class User(val name: String, val age: String).

5)
var arr = IntArray(size) 
var arr = IntArray(size){0}  
var arr = IntArray(size){it}
We also can create array with built in function like-

var arr = intArrayOf(1, 2, 3, 4, 5) // create an array with 5 values
Another way

var arr = Array(size){0} // it will create an integer array
var arr = Array<String>(size){"$it"} // this will create array with "0", "1", "2" and so on.
You also can use doubleArrayOf() or DoubleArray() or any primitive type instead of Int.

6)var is like general variable and it's known as a mutable variable in kotlin and can be assigned multiple times.
val is like Final variable and it's known as immutable in kotlin and can be initialized only single time.

7)1.val a = "Hello"
val b = "World"

val sb = StringBuilder()
sb.append(a).append(b)
val c = sb.toString()

print(c)
2.val a = "Hello"
val b = "World"
val c = a + b 

print(c)
3.String a = "Hello "
String b = a.concat("World")

8)Null is seen differently in Kotlin than it is just a cause of null-pointer exceptions.
Your function call is ignored if the value is null, and the outcome is null.
Your function call will be executed normally if the value is not null.
The add() function is not made if somevariable.value is null.
On whatever somevariable, the call to add() is done if somevariable.value is not null.worth 

11)onCreate():
Called when the activity is first created. This is where you should do all of your normal static set up: create views, bind data to lists, etc. This method also provides you with a Bundle containing the activity’s previously frozen state, if there was one. Always followed by onStart().
onRestart():
Called after your activity has been stopped, prior to it being started again. Always followed by onStart()
onStart():
Called when the activity is becoming visible to the user. Followed by onResume() if the activity comes to the foreground.
onResume():
Called when the activity will start interacting with the user. At this point your activity is at the top of the activity stack, with user input going to it. Always followed by onPause().
onPause ():
Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) been killed. The counterpart to onResume(). When activity B is launched in front of activity A, this callback will be invoked on A. B will not be created until A’s onPause() returns, so be sure to not do anything lengthy here.
onStop():
Called when you are no longer visible to the user. You will next receive either onRestart(), onDestroy(), or nothing, depending on later user activity. Note that this method may never be called, in low memory situations where the system does not have enough memory to keep your activity’s process running after its onPause() method is called.
onDestroy():
The final call you receive before your activity is destroyed. This can happen either because the activity is finishing (someone called finish() on it, or because the system is temporarily destroying this instance of the activity to save space. You can distinguish between> these two scenarios with the isFinishing() method.

12)An AndroidManifest.xml file (exactly that name) must be present in the root directory of every application. Before the Android system can execute any of the programme's code, it must first have access to the manifest, which provides the system with crucial information about the application.

13)An intent is a general statement of a task to be carried out. To launch an Android.app.Activity or broadcast, use it with startActivity.Send it to any interested Android.content components and BroadcastReceiver components.Android.content or context#startService.To connect with a background android.app.Service, use context#bindService.
A capability for late runtime binding between the code in several apps is provided by an intent. It serves as the glue connecting activities when they are launched, which is where it is most useful. Essentially, it is a passive data structure that contains an abstract description of an action that has to be done.

14)ConstraintLayout

GridLayout

FrameLayout

LinearLayout

RelativeLayout

TableLayout
