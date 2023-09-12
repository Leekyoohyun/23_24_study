#FirstPython.py
name=input("What is your name?") #input은 char형을 return함
print("Hello,",name)


#FirstPython.py
firstname=input("What is your firstname?")
surname=input("What is your surname?")
print("Hello,", firstname, surname)

import turtle
t=turtle.Pen()
for x in range(100):
    t.forward(x)
    t.left(90)

import turtle
t=turtle.Pen()
for x in range(100):
    print(x) #숫자카운트 가능
    t.forward(x)
    t.left(90)
