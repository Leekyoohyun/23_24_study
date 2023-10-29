#y''=y^2+x 풀기, y(0)=1, y'(0)=1 y=z, z'=y''=y^2+x
import matplotlib.pyplot as plt
import numpy as np

Nt=1000
dt=0.001
x=np.empty(Nt, float)
y=np.empty(Nt, float)
z=np.empty(Nt, float)
x[0]=0
y[0]=1
z[0]=1
for n in range(Nt-1):
    x[n+1]=x[n]+dt
    y[n+1]=dt*z[n]+y[n]
    z[n+1]=dt*(y[n]*y[n]+x[n])+z[n]
plt.plot(x,y)
plt.show()
