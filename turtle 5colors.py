import turtle
t=turtle.Pen()
colors=["red", "orange", "green", "blue", "purple"]
# 이번엔 총 5가지 색깔 리스트이다.
for x in range(6): #for 변수 in range
    t.pencolor(colors[x%5])
#x가 0=빨 1=주 2=초 3=파 4=보
    t.forward(100)
    t.circle(100)
#앞으로 200만큼 이동
    t.left(75)
#왼쪽으로 144도 회전
    

