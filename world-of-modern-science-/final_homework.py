import matplotlib.pyplot as plt
import numpy as np

skid_length=170
t=15
# 새로운 질량 가정
M_A = 2000  # A 차량의 질량 (kg)
M_B = 2000  # B 차량의 질량 (kg)

# 차량 A의 속도 범위 재설정 (이번에는 0부터 120km/h까지)
v_A_range = np.linspace(0, 120, 400)  # A 차량의 초기 속도 범위 (km/h)

# 차량 B의 속도를 차량 A의 속도보다 낮게 설정
# 차량 A가 차량 B를 추돌했다고 가정하므로 A의 속도가 B보다 높아야 함
v_B_calculated = [-(skid_length * (M_A + M_B) - M_A * v_A * t) / (M_B * t) for v_A in v_A_range]
v_B_calculated = [min(v_B, v_A - 10) for v_B, v_A in zip(v_B_calculated, v_A_range)]  # B의 속도를 A보다 항상 낮게 설정

# 결과 시각화
plt.figure(figsize=(10, 6))
plt.plot(v_A_range, v_B_calculated, label='Calculated v_B (less than v_A)')
plt.title('Revised Relationship between Initial Speeds of Vehicles A and B')
plt.xlabel('Initial Speed of Vehicle A (km/h)')
plt.ylabel('Calculated Initial Speed of Vehicle B (km/h)')
plt.grid(True)
plt.legend()
plt.show()
