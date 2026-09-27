public class stringmethod {
    public static void main(String[] args) {

        String name1 = "tony";
        String lastname = "stark";
        String fullname = name1 + lastname;

        System.out.println(fullname.length());

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

    }
}

explanation
Sure — here is the **whole code step-by-step and point-by-point**:

### 1. Create the class

```java
public class reverseingstring
```

Creates a class named `reverseingstring`.

### 2. Main method

```java
public static void main(String[] args)
```

Program execution starts from the `main()` method.

### 3. Create the StringBuilder

```java
StringBuilder str = new StringBuilder("Hello");
```

Creates a `StringBuilder` containing:

```text
Hello
```

Indexes are:

```text
H  e  l  l  o
0  1  2  3  4
```

### 4. Start the loop

```java
for (int i = 0; i < str.length() / 2; i++)
```

* `i = 0` → starts from the first index.
* `str.length()` is `5`.
* `5 / 2 = 2`.
* Therefore, the loop runs for `i = 0` and `i = 1`.

We only go halfway because we're swapping two characters at a time.

### 5. Find the first character's index

```java
int firstcharindex = i;
```

When `i = 0`:

```text
firstcharindex = 0
```

When `i = 1`:

```text
firstcharindex = 1
```

So we move from **left to right**.

### 6. Find the last character's index

```java
int lastcharindex = str.length() - 1 - i;
```

For `i = 0`:

```text
5 - 1 - 0 = 4
```

So:

```text
0 ↔ 4
```

For `i = 1`:

```text
5 - 1 - 1 = 3
```

So:

```text
1 ↔ 3
```

Therefore, we're moving from **both ends toward the middle**.

### 7. Get the first character

```java
char firstchar = str.charAt(firstcharindex);
```

`charAt()` gets the character at a particular index.

For `i = 0`:

```text
charAt(0) → H
```

So:

```text
firstchar = H
```

### 8. Get the last character

```java
char lastchar = str.charAt(lastcharindex);
```

For `i = 0`:

```text
charAt(4) → o
```

So:

```text
lastchar = o
```

### 9. Put the last character at the first position

```java
str.setCharAt(firstcharindex, lastchar);
```

This changes:

```text
Hello
```

to:

```text
oello
```

### 10. Put the first character at the last position

```java
str.setCharAt(lastcharindex, firstchar);
```

Now:

```text
oello
```

becomes:

```text
oellH
```

So we have swapped:

```text
H ↔ o
```

### 11. Second iteration

Now `i = 1`.

We swap:

```text
index 1 ↔ index 3
e ↔ l
```

So:

```text
oellH
```

becomes:

```text
olleH
```

### 12. Loop stops

Now `i = 2`.

Condition:

```java
i < str.length() / 2
```

becomes:

```text
2 < 2
```

which is false, so the loop stops.

### 13. Print the result

```java
System.out.println(str);
```

Output:

```text
olleH
```

### 🔑 Main idea

The program basically does:

```text
Hello
 ↓
H ↔ o
 ↓
oellH
 ↓
e ↔ l
 ↓
olleH
```

So the main logic is:

**Take the first and last characters → swap them → move toward the middle → repeat.**
