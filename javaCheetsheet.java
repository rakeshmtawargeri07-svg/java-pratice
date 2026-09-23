Java Syntax Cheatsheet — Basics
1. Data Types & Variables
int a = 10;
long b = 10000000000L;
double d = 3.14;
float f = 3.14f;
char c = 'x';
boolean flag = true;
byte by = 127;
short sh = 32000;

final int MAX = 100;          // constant

// Type casting
int x = (int) 3.99;           // 3 (truncates)
double y = (double) 5 / 2;    // 2.5

// Wrapper classes
Integer boxed = 5;
int unboxed = boxed;
Integer.parseInt("123");
Integer.toString(123);
Integer.MAX_VALUE; Integer.MIN_VALUE;
2. Operators
+  -  *  /  %                 // arithmetic
==  !=  >  <  >=  <=          // relational
&&  ||  !                     // logical
&  |  ^  ~  <<  >>  >>>       // bitwise
+=  -=  *=  /=  %=            // assignment
++x  x++  --x  x--            // increment/decrement
cond ? a : b                  // ternary
3. Control Flow
if (a > b) { } else if (a == b) { } else { }

for (int i = 0; i < n; i++) { }
for (int val : arr) { }              // enhanced for-loop
while (cond) { }
do { } while (cond);

switch (x) {
    case 1: /* ... */ break;
    case 2: case 3: /* fallthrough */ break;
    default: /* ... */
}

break; continue;                     // loop control
label: for (...) { break label; }    // labeled break
4. Arrays
int[] arr = new int[5];              // default 0s
int[] arr2 = {1, 2, 3, 4, 5};
int[] arr3 = new int[]{1, 2, 3};
int[][] grid = new int[3][4];        // 2D array
int[][] jagged = new int[3][];       // jagged array

arr.length                           // field, no parentheses
java.util.Arrays methods:

Arrays.sort(arr);                              // ascending, in place
Arrays.sort(arr, from, to);                    // sort a range
Arrays.sort(boxedArr, Collections.reverseOrder()); // descending — needs Integer[]
Arrays.fill(arr, 0);                           // fill all with value
Arrays.fill(arr, from, to, val);               // fill a range
Arrays.copyOf(arr, newLength);                 // resize/copy
Arrays.copyOfRange(arr, from, to);             // sub-array
Arrays.equals(arr1, arr2);                     // element-wise equality
Arrays.toString(arr);                          // "[1, 2, 3]" for printing
Arrays.deepToString(grid);                     // for 2D arrays
Arrays.asList(1, 2, 3);                        // fixed-size List view
Arrays.binarySearch(arr, key);                 // array must be sorted first
Arrays.stream(arr).sum();                      // needs java.util.stream
Arrays.stream(arr).max().getAsInt();
Arrays.stream(arr).boxed().toArray(Integer[]::new); // int[] -> Integer[]
5. Strings
Strings are immutable — every "modifying" method returns a new String.

String s = "hello world";

s.length();
s.charAt(0);
s.substring(1);           // from index 1 to end
s.substring(1, 4);        // [1, 4)
s.indexOf('o');            // first occurrence, -1 if absent
s.indexOf("wo");
s.lastIndexOf('o');
s.contains("wor");
s.startsWith("hel");
s.endsWith("rld");

s.equals(other);           // value equality — never use == for strings
s.equalsIgnoreCase(other);
s.compareTo(other);        // lexicographic, negative/0/positive

s.toUpperCase();
s.toLowerCase();
s.trim();                  // remove leading/trailing whitespace
s.strip();                 // like trim(), unicode-aware
s.replace('o', '0');       // char replace
s.replace("o", "0");       // string replace
s.replaceAll("[0-9]", ""); // regex replace
s.split(",");              // returns String[]
s.split(" ", 2);           // limit splits

s.toCharArray();           // -> char[]
s.chars();                 // -> IntStream of char codes
s.isEmpty();
s.isBlank();
s.repeat(3);
s.concat(" more");

String.valueOf(123);
String.valueOf(3.14);
String.join(", ", "a", "b", "c");   // "a, b, c"
String.join("-", list);
String.format("%d-%s", 5, "x");
6. StringBuilder
Use this instead of + when building strings in a loop.

StringBuilder sb = new StringBuilder();
sb.append("a").append(5).append('c');   // chainable
sb.insert(0, "start-");
sb.delete(0, 3);
sb.deleteCharAt(0);
sb.reverse();
sb.setCharAt(0, 'X');
sb.charAt(0);
sb.length();
sb.toString();
sb.indexOf("abc");
sb.replace(0, 2, "yz");
7. Math Class
Math.max(a, b);
Math.min(a, b);
Math.abs(x);
Math.pow(base, exp);
Math.sqrt(x);
Math.ceil(x);
Math.floor(x);
Math.round(x);
Math.random();             // [0.0, 1.0)
Math.PI;
Math.log(x);               // natural log
Math.log10(x);
