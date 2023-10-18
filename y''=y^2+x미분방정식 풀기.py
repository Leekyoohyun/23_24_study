#y''=y^2+x 미분방정식 풀기
import matplotlib.pyplot as plt
import numpy as np

g=9.8
Nt=1000
xList=np.empty(Nt,float)
yList=np.empty(Nt,float)
zList=np.empty(Nt,float)
xList[0]=0
yList[0]=1
zList[0]=1
dt=0.001
for n in range(Nt-1):
    yList[n+1]=dt*zList[n]+yList[n]
    zList[n+1]=dt*((yList[n])**2+xList[n])+zList[n]
    xList[n+1]=xList[n]+dt
    
plt.plot(xList,yList)
plt.show()
