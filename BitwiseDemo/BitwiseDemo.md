# Bitwise Demo
Bitwise operators are weird! To play with these operators,
I setup this project to work on binary numbers and display the
results. What I learned is that bitwise operators help us do specialized
math that can be useful for comparing bits in an integer.

Also, I got a lot of practice entering:
`System.out.println("Message to print")`

While this may seem silly when we can simply do math with the integers in
decimal value, some math problems get easier if we can play with bits.
Being able to play with bits efficiently makes us better programmers.

## >> Right Shift
Right shift drops the rightmost bit and shifts everything right. The result
is dividing by 2, rounding down to the closest integer.

## << Left Shift
Left shift tacks a 0 bit to the right side of the number and shifts everything
left. The result is a doubling for every bit that we shift. Therefore,
a << 2 would be multiplying by 4, and a << 3 would be multiplying by 8.

## >>> Unsigned right bit shift
The most interesting of this cases for me was >>>, the **unsigned right shift**.
The unsigned right shift is helpful when you are shifting a very large integer
to the right. With how integers are represented in binary form, it's possible
to overflow the maximum size for an integer. When we try to use right shift to
divide the large integer in half, we may end up with an unexpected negative 
number.

## ^ XOR
The exclusive or compares the two binary representations. If only one of the
'digits' has a 1 in a given column, the result will have a 1 for that column.
Otherwise, it's set to 0.

## | OR
The or compares the two binary representations. If one or both
of the 'digits' in a column are 1, the result will have 1 for that column.
Otherwise, it's set to 0.

## & AND
The and compares the two binary representations. If both of the 'digits' in the
column are 1, the result will have 1 for that column. Otherwise, it's set
to 0.

## ~ Complement
The complement of a binary number is taking all the 0's and turning them into
1's, and turning all the 1's into 0's.

## Two's Complement
While the concept of Two's complement isn't a bitwise operator, it's the way
we represent integers, and the way numbers are encoded can be described in
bitwise operations.

let a = 15
In 32-bit encoding: 
a = 0000 0000 0000 0000 0000 0000 0000 1111

Therefore, if b = -a:
First we complement a:
0000 0000 0000 0000 0000 0000 0000 1111 -> 1111 1111 1111 1111 1111 1111 1111 0000

Next, add 1 to the binary representation:
1111 1111 1111 1111 1111 1111 1111 0000 -> 1111 1111 1111 1111 1111 1111 1111 0001

```
System.out.println("b is: "+0b11111111111111111111111111110001)
b is: -15
```
See Proof.java to verify the above result.
For a great explanation of Two's Complement, see the link below:

<https://www.cs.cornell.edu/~tomf/notes/cps104/twoscomp.html>
