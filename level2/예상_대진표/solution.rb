# 자바에서 다른 사람 소스 봤던 것을 루비로 구현해 봄
def solution(n, a, b)
  ((a - 1) ^ (b - 1)).to_s(2).size
end

p solution 8, 4, 7
