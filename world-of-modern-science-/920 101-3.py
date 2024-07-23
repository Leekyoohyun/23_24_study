sum=0
for n in range(10001):
    if n%7==2:
     if n%3==0:
      if n%5==3:
        sum=sum+n
        
print(sum)
