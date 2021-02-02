def solution(a, b)
  # 숫자 차이가 커지면 sum, reduce, inject를 사용하는 것보다 등차수열의 합 공식을 사용하는 것이 훨씬 빠르다
  # return (a < b ? (a..b) : (b..a)).to_a.sum
  return a == b ? a : ((b - a).abs + 1) * (a + b) / 2
end

p solution 3, 5
p solution 3, 3
p solution 5, 3
